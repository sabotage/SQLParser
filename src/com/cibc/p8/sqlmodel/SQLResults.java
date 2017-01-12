package com.cibc.p8.sqlmodel;

import java.sql.ResultSet;
import java.util.ArrayList;

public class SQLResults {

	public String succFlag;
	public ArrayList<String> columnList;
	public ArrayList<String> columnType;
	public ArrayList<ArrayList<Object>> sqlresults;
	
	public void setResults(ResultSet set) {  //generate results from ResultSet
		
	}
}
