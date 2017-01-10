package com.cibc.p8.complexsql.model;

import java.util.ArrayList;

public class JoinNode extends SqlNode {

	private ArrayList <String> leftColumns;
	private ArrayList <String> rightColumns;
	private String jointype;   // inner, outer, left, right
	private String stratagy; // INDEX_NEXT_LOOP, HASH, 
	private SqlNode left;
	private SqlNode right;
	public ArrayList<String> getLeftColumns() {
		return leftColumns;
	}
	public void setLeftColumns(ArrayList<String> leftColumns) {
		this.leftColumns = leftColumns;
	}
	public ArrayList<String> getRightColumns() {
		return rightColumns;
	}
	public void setRightColumns(ArrayList<String> rightColumns) {
		this.rightColumns = rightColumns;
	}
	
	public String getStratagy() {
		return stratagy;
	}
	public void setStratagy(String stratagy) {
		this.stratagy = stratagy;
	}
	public SqlNode getLeft() {
		return left;
	}
	public void setLeft(SqlNode left) {
		this.left = left;
	}
	public SqlNode getRight() {
		return right;
	}
	public void setRight(SqlNode right) {
		this.right = right;
	}
	public String getJointype() {
		return jointype;
	}
	public void setJointype(String jointype) {
		this.jointype = jointype;
	}
	
}
