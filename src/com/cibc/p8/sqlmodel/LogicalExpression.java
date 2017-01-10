package com.cibc.p8.sqlmodel;

public class LogicalExpression {

	public AbstractNode left;   // table1.col1
	public String operator;     // in
	public AbstractNode right;  // select c from tablec where col3=1
}
