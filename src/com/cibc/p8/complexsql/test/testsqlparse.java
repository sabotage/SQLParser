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
			try {
				Map callSql = parser.callSql("select sum(t1.a), t2.b from table1 t1 left join table2 t2 on t1.name = t2.name left join (select * from table3 t3 where t3.col3>100) on t3.id=t1.id where t1.c in (select city from citylist where provinceid=10) and t1.a>500", list);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
