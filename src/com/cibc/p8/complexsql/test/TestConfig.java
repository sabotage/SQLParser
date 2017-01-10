package com.cibc.p8.complexsql.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.cibc.p8.complexsql.util.Config;

public class TestConfig {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Config cfg = Config.instance;
		ArrayList tables = cfg.getTableByKey("table1",">", "150");
		//System.out.println (table);
		ArrayList tables1 = cfg.getTableByKey("table2","=", "150");
		//System.out.println (table2);
		ArrayList keylist = new ArrayList();
		keylist.add("50");
		keylist.add("150");
		keylist.add("180");
		keylist.add("22");
		ArrayList tablelist1 = cfg.getTableByKey("table2", keylist);
	}

}
