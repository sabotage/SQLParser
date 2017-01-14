package com.cibc.p8.sqlmodel;

public class AGGFuncItem implements AbstractNode {

	public String function;
	public String item;
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return function + "(" + item +")";
	}

	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.FUNC;
	}

	@Override
	public String getExecString() {
		// TODO Auto-generated method stub
		return null;
	}

}
