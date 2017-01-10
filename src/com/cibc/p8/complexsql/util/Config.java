package com.cibc.p8.complexsql.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Config<E> {
	public static Config<Object> instance = new Config<Object>("D://JAVA//work//antlr//sqlparser.cfg");
	HashMap<String, ArrayList<Range>> tablerange = new HashMap<String, ArrayList<Range>>();

	Properties pro = new Properties();

	public static Config<?> getInstance() {
		return instance;
	}

	public Config(String cfgfile) {

		try {
			FileInputStream in = new FileInputStream(cfgfile);
			pro.load(in);
			in.close();

			String[] tables = pro.getProperty("tables").split(",");
			for (int i = 0; i < tables.length; i++) {
				String strRange = pro.getProperty(tables[i] + ".range");
				JSONObject json = new JSONObject(strRange);
				JSONArray array = json.getJSONArray("ranges");
				ArrayList<Range> rangelist = new ArrayList<Range>();
				for (int j = 0; j < array.length(); j++) {
					JSONObject item = array.getJSONObject(j);
					Range r = new Range();
					r.Low = item.getInt("low");
					r.High = item.getInt("high");
					r.Id = item.getString("id");
					rangelist.add(r);
				}

				tablerange.put(tables[i], rangelist);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList getTableRange(String table) {
		return tablerange.get(table);
	}

	public String getShardingCol(String table) {
		return pro.getProperty(table + ".shardingkey");
	}

	public String getShardingType(String table) {
		return pro.getProperty(table + ".shardingType");
	}
	
	public String getDBBySharding(String stable) {
		return pro.getProperty(stable);
	}
	
	public String [] getAllDBs () {
		return pro.getProperty("dbs").split(",");
	}

	/*
	 * @SuppressWarnings("unchecked") public ArrayList<String> getTableByKey
	 * (String table, String keyLow, String keyHigh) { ArrayList<String> result
	 * = new ArrayList<String>(); ArrayList<Range> range =
	 * tablerange.get(table); Iterator<Range> it = range.iterator();
	 * 
	 * int val_low = 0; int val_high = 0;
	 * 
	 * if (pro.getProperty(table +".shardingtype").equals("range")) { val_low =
	 * Integer.parseInt(keyLow); val_high = Integer.parseInt(keyHigh); }else if
	 * (pro.getProperty(table +".shardingtype").equals("hash")) { return result;
	 * }
	 * 
	 * while (it.hasNext()) { Range r = it.next();
	 * 
	 * if ((r.Low>=val_low && r.Low<=val_high) || (r.High>=val_low && r.High <=
	 * val_high)) { result.add(table + "_" + r.Id); } } return result; }
	 */
	
	public String getOpposeOP(String op) {
		if (op.equals(">")) {
			return "<";
			
		}else if (op.equals("<")) {
			return ">";
		}else if (op.equals(">=")) {
			return "<=";
		}else if (op.equals("<=")) {
			return ">=";
		}
		return op;
	}
	
	public String removeQuotes (String exp) {
		if (exp.startsWith("(")) {
			exp = exp.substring(1);
		}
		if (exp.endsWith(")")) {
			exp = exp.substring(0, exp.length()-1);
		}
		return exp;
	}
	@SuppressWarnings("unchecked")
	public ArrayList getTableByKey(String table, String operator, String key) {
		Logger.log(Logger.DEBUG, table +" " + operator + " " + key);
		ArrayList result = new ArrayList();
		ArrayList<Range> range = tablerange.get(table);
		Iterator<Range> it = range.iterator();
		int val = 0;

		if (pro.getProperty(table + ".shardingtype").equals("range")) {
			val = Integer.parseInt(key);
		} else if (pro.getProperty(table + ".shardingtype").equals("hash")) {
			val = key.hashCode() % Integer.parseInt(pro.getProperty(table + ".shardingnum"));
		}

		while (it.hasNext()) {
			Range r = it.next();
			if (operator.equals("=")) {
				if (val >= r.Low && val <= r.High) {
					result.add(table + "_" + r.Id);
				}
			}else if (operator.equals(">")) {
				if (r.High > val) {
					result.add(table + "_" + r.Id);
				}
			}else if (operator.equals(">=")) {
				if (r.High >= val) {
					result.add(table + "_" + r.Id);
				}
			}else if (operator.equals("<")) {
				if (r.Low < val) {
					result.add(table + "_" + r.Id);
				}
			}else if (operator.equals("<=")) {
				if (r.Low <= val) {
					result.add(table + "_" + r.Id);
				}
			}else {
				result.add(table + "_" + r.Id);
			}
			
		}
		return result;
	}

	public ArrayList<String> getTableByKey(String table, ArrayList<String> keylist) {
		ArrayList<String> result = new ArrayList<String>();
		// TODO: not implemented
		return result;
	}

}

class Range {
	int Low;
	int High;
	String Id;
};
