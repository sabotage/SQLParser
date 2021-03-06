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

import com.cibc.p8.complexsql.util.Config;
import com.cibc.p8.sqlmodel.PlanNode;

public class SQLParser {

	public PlanNode callSql(String sqlstring, ArrayList list) throws FileNotFoundException, IOException {
		
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
        
		
        
        return model.current;
	}
	
	
}


