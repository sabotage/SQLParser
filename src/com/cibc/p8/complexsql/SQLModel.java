package com.cibc.p8.complexsql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.cibc.p8.sqlmodel.SQLNode;



public class SQLModel {
	public SQLNode root = null;
	public SQLNode current = null;

	
	public PARSING_STAGE currentStage;
	public SUBSTAGE substage;
	public enum PARSING_STAGE {
		ITEMLIST, FROM, JOIN, TABLELIST, WHERE, HAVING, ORDERBY, GROUPBY ,LIMIT
	}
	
	public enum SUBSTAGE {
		TABLE_REF,  
	}
		
	
}
