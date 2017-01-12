package com.cibc.p8.complexsql.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cibc.p8.sqlmodel.AbstractNode;
import com.cibc.p8.sqlmodel.FIXNode;
import com.cibc.p8.sqlmodel.JoinNode;
import com.cibc.p8.sqlmodel.LogicalExpression;
import com.cibc.p8.sqlmodel.SQLNode;

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
		
		 sharding key t1.a
		*/
	/*	public ArrayList<String> itemlist;  //SQLNode对应的select字段
		public ArrayList<String> joinlist;  //SQLNode对应的join_list
		public ArrayList<String> tablelist; //对应的table_list
		public AbstractNode  whereconditions; //对应的WHERE
		public AbstractNode  havingconditions; //对应的having
		public int selectlimit; //SQLNode对应的limit
		public int offsetlimit; //SQLNode对应的offset
		public ArrayList<String> grouplist; //SQLNode对应的group by
		public ArrayList<String> orderlist; //SQLNode对应的order by
		*/
		ArrayList <String> itemlist = new ArrayList <String> ();
		itemlist.add("t1.a");
		itemlist.add("t2.b");
		q.itemlist = itemlist;
		JoinNode j1 = new JoinNode();
		ArrayList <String> tablelist = new ArrayList<String> ();
		tablelist.add("table1 t1");
		tablelist.add("table2 t2");
		tablelist.add("table3 t3");
		j1.tablelist = tablelist;
		q.tablelist = tablelist;
		j1.joinlist = new ArrayList();
		j1.joinlist.add(new FIXNode("table1 t1"));
		j1.joinlist.add(new FIXNode("table2 t2"));
		j1.jointype = j1.jointype.LEFTJOIN;
		j1.OnCondition = new LogicalExpression();
		j1.OnCondition.left = new FIXNode("t1.name");
		j1.OnCondition.right = new FIXNode("t2.name");
		j1.OnCondition.operator = "=";
		JoinNode j2 = new JoinNode();
		q.join = j2;
		j2.joinlist = new ArrayList();
		j2.joinlist.add(j1);
		j2.jointype = j2.jointype.INNERJOIN;
		j2.OnCondition = new LogicalExpression();
		j2.OnCondition.left = new FIXNode("t3.id");
		j2.OnCondition.right = new FIXNode("t1.id");
		j2.OnCondition.operator = "=";
		SQLNode q1 = new SQLNode();  //select * from table3 t3 where t3.col3>100
		q1.itemlist = new ArrayList ();
		q1.itemlist.add("*");
		q1.tablelist = new ArrayList();
		q1.tablelist.add("table3 t3");
		
		j2.joinlist.add(q1);
		LogicalExpression c1 = new LogicalExpression();
		q1.whereconditions = c1;
		c1.left = new FIXNode("t3.col3");
		c1.right = new FIXNode("100");
		c1.operator = ">";
		LogicalExpression c2 = new LogicalExpression();
		q.whereconditions = c2;
		LogicalExpression c3 = new LogicalExpression();
		c2.left = c3;
		c2.operator = "and";
		LogicalExpression c4 = new LogicalExpression();
		c2.right = c4;
		c4.left = new FIXNode("t1.a");
		c4.operator = ">";
		c4.right = new FIXNode("500");
		
		c3.left = new FIXNode("t1.c");
		c3.operator = "in";
		SQLNode q3 = new SQLNode();
		c3.right = q3;
		q3.itemlist = new ArrayList();
		q3.itemlist.add("city");
		q3.tablelist = new ArrayList();
		q3.tablelist.add("citylist");
		
		LogicalExpression c5= new LogicalExpression ();
		q3.whereconditions = c5;
		c5.left = new FIXNode("provinceid");
		c5.operator = "=";
		c5.right = new FIXNode("10");
		
		q.orderlist = new ArrayList();
		q.orderlist.add("t1.name");
		
		System.out.println(q.getString());
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
	}

	@Test
	public void test1() {
//		
	}
}
