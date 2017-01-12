package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public class PlanNode implements AbstractNode{
	public String sqlString; //节点对应的SQL String
	public PlanNode master;   //上级节点
	public PlanNode slave;    //下级节点
	public PlanNode first;    //同级第一个节点
	public PlanNode last;     //同级最后一个节点
	public PlanNode next;     //同级下一个节点
	public int childnum;      //下级节点数量
	public SQLResults  resultCache; //结果集缓存
	@Override
	public String getString() {
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
