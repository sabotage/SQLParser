package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public interface AbstractNode {
	public String getString();  //��ȡִ�е�SQL
	public String getExecString(); //������������SQL����
	public ELEMENTTYPE getElementType();
	
	public enum NODETYPE {
		SELECT, INSERT, DELETE, UPDATE, ALTER, UNDEFINED
	}
	
	public enum ELEMENTTYPE {
		SQL, FIX, LOGICAL, JOIN, FUNC, UNDEFINED
	}

}
