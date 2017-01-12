package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public interface AbstractNode {
	public String getString();  //获取执行的SQL
	public String getExecString(); //将结果集带入的SQL内容
	public ELEMENTTYPE getElementType();
	
	public enum NODETYPE {
		SELECT, INSERT, DELETE, UPDATE, ALTER, UNDEFINED
	}
	
	public enum ELEMENTTYPE {
		SQL, FIX, LOGICAL, JOIN, FUNC, UNDEFINED
	}

}
