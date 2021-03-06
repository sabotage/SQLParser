package com.cibc.p8.complexsql.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cibc.p8.sqlmodel.AbstractNode;
import com.cibc.p8.sqlmodel.FIXITEM;
import com.cibc.p8.sqlmodel.JoinItem;
import com.cibc.p8.sqlmodel.LogicalExpression;
import com.cibc.p8.sqlmodel.SQLNode;
import com.cibc.p8.sqlmodel.SQLResults;
import com.cibc.p8.sqlmodel.TableItem;

public class testSQLExec {
	/**
	 * @throws java.lang.Exception
	 */
	private SQLNode q;
	@Before
	public void setUp() throws Exception {
		q = new SQLNode();
		/* example SQL:
		
		select t1.a, t2.b from table1 t1 left join table2 t2 on t1.name = t2.name left join (select * from table3 t3 where t3.col3>100) on t3.id=t1.id
		where t1.c in (select city from citylist where provinceid=10) and t1.a>500
	*/	
		ArrayList <String> itemlist = new ArrayList <String> ();
		itemlist.add("t1.a");
		itemlist.add("t2.b");
		q.itemlist = itemlist;
		JoinItem j1 = new JoinItem();
		ArrayList <TableItem> tablelist = new ArrayList<TableItem> ();
		tablelist.add(new TableItem("table1", "t1"));
		tablelist.add(new TableItem("table2", "t2"));
		tablelist.add(new TableItem("table3", "t3"));
		q.tablelist = tablelist;
		j1.joinlist = new ArrayList();
		j1.joinlist.add(new FIXITEM("table1 t1"));
		j1.joinlist.add(new FIXITEM("table2 t2"));
		j1.jointype = j1.jointype.LEFTJOIN;
		j1.OnCondition = new LogicalExpression();
		j1.OnCondition.left = new FIXITEM("t1.name");
		j1.OnCondition.right = new FIXITEM("t2.name");
		j1.OnCondition.operator = "=";
		q.joinlist = new ArrayList();
		JoinItem j2 = new JoinItem();
		q.joinlist.add(j2);
		j2.joinlist = new ArrayList();
		j2.joinlist.add(j1);
		j2.jointype = j2.jointype.INNERJOIN;
		j2.OnCondition = new LogicalExpression();
		j2.OnCondition.left = new FIXITEM("t3.id");
		j2.OnCondition.right = new FIXITEM("t1.id");
		j2.OnCondition.operator = "=";
		SQLNode q1 = new SQLNode();  //select * from table3 t3 where t3.col3>100
		q1.itemlist = new ArrayList ();
		q1.itemlist.add("*");
		q1.tablelist = new ArrayList();
		TableItem tb3 = new TableItem("table3","t3");
		q1.tablelist.add(tb3);
		
		j2.joinlist.add(q1);
		LogicalExpression c1 = new LogicalExpression();
		q1.whereconditions = c1;
		c1.left = new FIXITEM("t3.col3");
		c1.right = new FIXITEM("100");
		c1.operator = ">";
		LogicalExpression c2 = new LogicalExpression();
		q.whereconditions = c2;
		LogicalExpression c3 = new LogicalExpression();
		c2.left = c3;
		c2.operator = "and";
		LogicalExpression c4 = new LogicalExpression();
		c2.right = c4;
		c4.left = new FIXITEM("t1.a");
		c4.operator = ">";
		c4.right = new FIXITEM("500");
		
		c3.left = new FIXITEM("t1.c");
		c3.operator = "in";
		SQLNode q3 = new SQLNode();
		c3.right = q3;
		q3.itemlist = new ArrayList();
		q3.itemlist.add("city");
		q3.tablelist = new ArrayList();
		TableItem tb = new TableItem("citylist","");
		q3.tablelist.add(tb);
		
		LogicalExpression c5= new LogicalExpression ();
		q3.whereconditions = c5;
		c5.left = new FIXITEM("provinceid");
		c5.operator = "=";
		c5.right = new FIXITEM("10");
		
		q.orderlist = new ArrayList();
		q.orderlist.add("t1.name");
		q.slaves = new ArrayList();
		q.slaves.add( q1);
		q.slaves.add(q3);
		q1.parent = q;
		q3.parent = q;
		q1.execStatus = 2;
		q3.execStatus = 2;
		
		SQLResults rc1 = new SQLResults();
		rc1.columnList = new ArrayList ();
		rc1.columnList.add("c1");
		rc1.columnList.add("c2");
		rc1.columnList.add("c3");
		rc1.columnType = new ArrayList();
		rc1.columnType.add("varchar(10)");
		rc1.columnType.add("varchar(10)");
		rc1.columnType.add("varchar(50)");
		rc1.sqlresults = new ArrayList();
		for (int i=0;i<10;i++) {
			ArrayList row = new ArrayList();
			row.add("val1" + i);
			row.add("val2" +i);
			row.add("val3" +i);
			rc1.sqlresults.add(row);
		}
		q1.resultCache = rc1;
		
		SQLResults rc2 = new SQLResults();
		rc2.columnList = new ArrayList ();
		rc2.columnList.add("c1");
		rc2.columnList.add("c2");
		rc2.columnList.add("c3");
		rc2.columnType = new ArrayList();
		rc2.columnType.add("varchar(10)");
		rc2.columnType.add("varchar(10)");
		rc2.columnType.add("varchar(50)");
		rc2.sqlresults = new ArrayList();
		
		for (int i=0;i<10;i++) {
			ArrayList row = new ArrayList();
			row.add("val1" + i);
		
			rc2.sqlresults.add(row);
		}
		q3.resultCache = rc2;
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void test() {
	//	fail("Not yet implemented");
		System.out.println(q.getString());
		System.out.println(q.getExecString());
	}

	@Test
	public void test1() {
//		
	}
}
