package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public interface AbstractNode {
	public String getSQLString();
	public NODETYPE getNodeType();
	public ArrayList exec();
	
	public enum NODETYPE {
		SQL, JOIN, MERGE, PLAN, SELECT, INSERT, DELETE, UPDATE, ALTER, COLUMN, FIX
	}

}
