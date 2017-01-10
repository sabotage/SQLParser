package com.cibc.p8.complexsql.model;

import java.util.ArrayList;

public class MergeNode extends SqlNode {
	private ArrayList<String> aggColumns; //avg(id), sum(id), count(id) 
	private String mergeType ; //agg, orderby, distinct&groupby
	private ArrayList <SqlNode> subqueries; // subqueries
	public ArrayList<String> getAggColumns() {
		return aggColumns;
	}
	public void setAggColumns(ArrayList<String> aggColumns) {
		this.aggColumns = aggColumns;
	}
	public String getMergeType() {
		return mergeType;
	}
	public void setMergeType(String mergeType) {
		this.mergeType = mergeType;
	}
	public ArrayList<SqlNode> getSubqueries() {
		return subqueries;
	}
	public void setSubqueries(ArrayList<SqlNode> subqueries) {
		this.subqueries = subqueries;
	}

}
