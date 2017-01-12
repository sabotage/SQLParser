package com.cibc.p8.sqlmodel;

import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;

public class LogicalExpression implements AbstractNode{

	public AbstractNode left;   // table1.col1
	public String operator;     // in
	public AbstractNode right;  // select c from tablec where col3=1
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		String s1 = left.getString();
		String s2 = right.getString();
		if (!(left instanceof FIXNode)) {
			s1 = "(" + s1 +")";
		}
		if (!(right instanceof FIXNode)) {
			s2 = "(" + s2 +")";
		}
		return s1 +" " + operator + " " + s2;
	}
	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.LOGICAL;
	}
	@Override
	public String getExecString() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String s1 = left.getExecString();
		String s2 = right.getExecString();
		if (!(left instanceof FIXNode)) {
			s1 = "(" + s1 +")";
		}
		if (!(right instanceof FIXNode)) {
			s2 = "(" + s2 +")";
		}
		return s1 +" " + operator + " " + s2;
	}
	
}
