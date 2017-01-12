package com.cibc.p8.sqlmodel;

public class FIXNode implements AbstractNode {

	public String value;
	
	public FIXNode (String value) {
		this.value = value;
	}
	
	public FIXNode (int value) {
		this.value = String.valueOf(value);
	}
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.FIX;
	}

	@Override
	public String getExecString() {
		// TODO Auto-generated method stub
		return value;
	}

}
