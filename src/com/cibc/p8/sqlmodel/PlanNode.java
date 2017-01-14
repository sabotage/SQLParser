package com.cibc.p8.sqlmodel;

import java.util.ArrayList;
import java.util.HashMap;

import com.cibc.p8.complexsql.SQLModel.PARSING_STAGE;
import com.cibc.p8.complexsql.SQLModel.SUBSTAGE;

public class PlanNode implements AbstractNode{
	public String sqlString; //节点对应的SQL String
	public PlanNode parent;   //上级节点
	public ArrayList<PlanNode> slaves;    //下级节点
	public SQLResults  resultCache; //结果集缓存
	public int execStatus = 0; // 0, not executed, 1: not fully executed  2: fully executed 

	public PARSING_STAGE currentstage;
	public SUBSTAGE substage;
	public HashMap tempCache = new HashMap(); 
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return sqlString;
	}
	
	public String getExecString() {
		// TODO Auto-generated method stub
		return sqlString;
	}
	
	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.SQL;
	}
	
	public NODETYPE getNodeType() {
		return NODETYPE.UNDEFINED;
	}
	
	public void execute() { //计算本节点的SQLResult 结果集
		
	}
}
