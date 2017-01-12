package com.cibc.p8.complexsql.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



import org.json.JSONArray;
import org.json.JSONObject;

public class SQLResultToJSON {
	  public static final JSONArray ResultSetToJsonArray(ResultSet rs) {
	        JSONObject element = null;
	        JSONArray ja = new JSONArray();
	        ResultSetMetaData rsmd = null;
	        String columnName, columnValue = null;
	        try {
	            rsmd = rs.getMetaData();
	            while (rs.next()) {
	                element = new JSONObject();
	                for (int i = 0; i < rsmd.getColumnCount(); i++) {
	                    columnName = rsmd.getColumnName(i + 1);
	                    columnValue = rs.getString(columnName);
	                    element.append(columnName, columnValue);
	                }
	                ja.put(element);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ja;
	    }

	    public static final JSONObject ResultSetToJsonObject(ResultSet rs) {
	        JSONObject element = null;
	        JSONArray ja = new JSONArray();
	        JSONObject jo = new JSONObject();
	        ResultSetMetaData rsmd = null;
	        String columnName, columnValue = null;
	        try {
	            rsmd = rs.getMetaData();
	            while (rs.next()) {
	                element = new JSONObject();
	                for (int i = 0; i < rsmd.getColumnCount(); i++) {
	                    columnName = rsmd.getColumnName(i + 1);
	                    columnValue = rs.getString(columnName);
	                    element.put(columnName, columnValue);
	                }
	                ja.put(element);
	            }
	            jo.put("result", ja);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return jo;
	    }

}
