package com.cibc.p8.complexsql;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ModelAdaptor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.cibc.p8.complexsql.model.SqlLeafNode;
import com.cibc.p8.complexsql.model.SqlNode;
import com.cibc.p8.complexsql.model.UnionNode;
import com.cibc.p8.complexsql.util.Config;

public class SQLParser2 {

	public SqlNode callSql(String sqlstring, ArrayList list) throws FileNotFoundException, IOException {
		
		for (int i=0; i< list.size() ; i++) {
			sqlstring = sqlstring.replaceFirst("\\?", (String) list.get(i));
		}
		ANTLRInputStream input = new ANTLRInputStream( new   ByteArrayInputStream(sqlstring.getBytes()));
		
		PLSQLLexer lexer = new PLSQLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PLSQLParser parser = new PLSQLParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.sql_statement();
        ParseTreeWalker walker  = new ParseTreeWalker();
        SQLModel model = new SQLModel();
        walker.walk(new MyListener(model), tree);
        //HashMap result = new HashMap();
        UnionNode result = new UnionNode();
		result.setType(SqlNode.Nodetype.UNION);
		result.setQueryString(sqlstring);
		ArrayList<SqlNode> resultnodes = new ArrayList<SqlNode> ();
		result.setNodes(resultnodes);

        String[] tables =  model.getTables();
        // need a struct like db--> table --> partition
        String[] dbs = Config.getInstance().getAllDBs();
        for (int i=0; i< dbs.length; i++) {
        	String dbquery = "";
        	int count = 0;
        	for (int j=0; j< tables.length; j++) { 
        		Object [] stables =  model.getTablepartitions(tables[j]).toArray(); 
        		for (int m=0; m<stables.length; m++) {
        		  String t_db = Config.getInstance().getDBBySharding((String)stables[m]);
        	      if ( t_db != null && dbs[i].equals(t_db)) {  // same db
        	    	  count ++;
        	    	  //dbtables.put(tables[j], (String) stables[m]);
        	    	  System.out.println ("DB:" + dbs[i] + " table:" + tables[j] + " stables:" + stables[m]);
        	    	  String newSqlStr = sqlstring;
        	    	  if (count >1) {
        	    		  dbquery = dbquery.concat(" UNION ");
        	    	  }
        	    	  newSqlStr = newSqlStr.replaceAll(tables[j], (String) stables[m]);
        	    	  dbquery = dbquery.concat(newSqlStr);
        	      }
        		}
        	}
        	if (!dbquery.equals("")) {
        		System.out.println ("DB: " + dbs[i] + " Query: " + dbquery);
        		SqlLeafNode node = new SqlLeafNode();
        	    node.setDb(dbs[i]);
        	    node.setQueryString(dbquery);
        	    resultnodes.add(node);
        	}
        	
        }
         
        return result;
	}
	
	
}


