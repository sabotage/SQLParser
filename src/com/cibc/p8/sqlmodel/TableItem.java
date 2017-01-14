package com.cibc.p8.sqlmodel;

public class TableItem implements AbstractNode {

	public String tablename = "";
	public String alias = "";
	
	public TableItem(String tablename, String alias) {
		this.tablename = tablename;
		this.alias = alias;
	}
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return tablename + " " + alias;
	}

	@Override
	public String getExecString() {
		// TODO Auto-generated method stub
		return tablename + " " + alias;
	}

	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.TABLE;
	}

}
