package com.cibc.p8.complexsql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

import com.cibc.p8.sqlmodel.PlanNode;
import com.cibc.p8.sqlmodel.SQLNode;



public class SQLModel {
	public PlanNode root = null;
	public PlanNode current = null;

	
	public Stack currentStageStack = new Stack();
	public enum PARSING_STAGE {
		ITEMLIST, FROM, TABLELIST, WHERE, HAVING, ORDERBY, GROUPBY ,LIMIT, UNDEFINED
	}
	
	public enum SUBSTAGE {
		TABLE_REF,COMPOUND,JOIN, JOIN_ON,UNDEFINED  
	}
		
	
}
