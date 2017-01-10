package com.cibc.p8.complexsql.model;

import java.util.ArrayList;

public class SqlNode {
	private Nodetype type;
	private String queryString;
	private ArrayList<String> resultColumns;  //结果列名
	private ArrayList<ArrayList<String>> resultList;   //结果集
	
	public enum Nodetype {
		UNION, JOIN, MERGE, LEAF, SUBQUERY
	}
	
	public String toString () {
		return null;
	}


	public ArrayList<String> getResultColumns() {
		return resultColumns;
	}


	public void setResultColumns(ArrayList<String> resultColumns) {
		this.resultColumns = resultColumns;
	}


	public ArrayList<ArrayList<String>> getResultList() {
		return resultList;
	}


	public void setResultList(ArrayList<ArrayList<String>> resultList) {
		this.resultList = resultList;
	}


	public String getQueryString() {
		return queryString;
	}


	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}


	public Nodetype getType() {
		return type;
	}


	public void setType(Nodetype type) {
		this.type = type;
	}
	
	

}
