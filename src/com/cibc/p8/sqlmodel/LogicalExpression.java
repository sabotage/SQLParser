package com.cibc.p8.sqlmodel;

import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;

public class LogicalExpression implements AbstractNode{

	public AbstractNode left;   // table1.col1
	public String operator;     // in
	public AbstractNode right;  // select c from tablec where col3=1
	public String leftstr = "";
	public String rightstr = "";
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "";
		if (left != null) {
			s1 = left.getString();
			if (!(left instanceof FIXITEM)) {
				s1 = "(" + s1 +")";
			}
		}
		if (right != null) {
			s2 = right.getString();
			if (!(right instanceof FIXITEM)) {
				s2 = "(" + s2 +")";
			}
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
		if (!(left instanceof FIXITEM)) {
			s1 = "(" + s1 +")";
		}
		if (!(right instanceof FIXITEM)) {
			s2 = "(" + s2 +")";
		}
		return s1 +" " + operator + " " + s2;
	}
	
}
