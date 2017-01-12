/**
 * 
 */
package com.cibc.p8.complexsql.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cibc.p8.complexsql.SQLParser;

/**
 * @author 10099359
 *
 */
public class testsqlparse {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testSelect1() {
		SQLParser parser = new SQLParser();
			ArrayList list = new ArrayList();
			list.add("350");
			list.add("250");
			Date d = new Date();
			long t1 = d.getTime();
//			for (int i=0 ; i<1000; i++) {
			//Map callSql = parser.callSql("select a.col1,b.col2,c.col3 from table1 a, table2 b, table3 c where a.col1=? and b.col2>? and a.col2=b.col2 and c.col3=100 or a.col3=c.col3", list);
			//SqlNode callSql = parser.callSql("select a.col1  from table1 a where a.col1=? or (a.col1=? or a.col1=500)", list);
			
			//SqlNode callSql = parser.callSql("select a.col1, b.col2 from table1 a where a.col1=? and a.col1=b.col1 and b.col2 in (select col3 from table3 where col4=5)", list);
			//SqlNode callSql = parser.callSql("select * from A u join B o on u.id = o.buyer_id where u.name='sun'", list);
						
			
			//System.out.println(callSql);
	//		}
			d = new Date();
			long t2 = d.getTime();
			System.out.println ("Total " + (t2-t1));
		
		
	}
	/*
	@Test
	public void testSelect2() {
		SQLParser parser = new SQLParser();
		try {
			ArrayList list = new ArrayList();
			list.add("oliver");
			Map callSql = parser.callSql("select DISTINCT id, AVG(price) from t1 WHERE id >=1 and name=? group by CONCAT(id,name) ORDER BY AVG(price);",list);
			System.out.println(callSql);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSelect3() {
		SQLParser parser = new SQLParser();
		try {
			ArrayList list = new ArrayList();
			list.add("1000");
			list.add("10010");
			Map callSql = parser.callSql("select st.dept as dept,count(*) as total  from db1.task st " + 
					" right join alarm  on alarm.event_uuid like CONCAT('zxjc_4', st.dept) or "
					+ "alarm.event_uuid like CONCAT('zxjc_5', st.dept) "
					+ "right join action on action.event_uuid = alarm.event_uuid and "
					+ "action.changetime >='2013-01-01' and action.changetime <='2015-01-01' "
					+ "where st.type=? and st.dept=?",list);
			System.out.println(callSql);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	

}
