package com.cibc.p8.complexsql.model;

import java.util.ArrayList;
import java.util.HashMap;

public class SubQueryNode extends SqlNode {
	private ArrayList<String> fromCondition;
	private ArrayList<String> whereConditions;
	private HashMap<String,SqlNode> children;
	
	public ArrayList<String> getFromCondition() {
		return fromCondition;
	}
	public void setFromCondition(ArrayList<String> fromCondition) {
		this.fromCondition = fromCondition;
	}
	public ArrayList<String> getWhereConditions() {
		return whereConditions;
	}
	public void setWhereConditions(ArrayList<String> whereConditions) {
		this.whereConditions = whereConditions;
	}
	public HashMap<String, SqlNode> getChildren() {
		return children;
	}
	public void setChildren(HashMap<String, SqlNode> children) {
		this.children = children;
	}
}