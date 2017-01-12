package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public class PlanNode implements AbstractNode{
	public String sqlString; //�ڵ��Ӧ��SQL String
	public PlanNode master;   //�ϼ��ڵ�
	public PlanNode slave;    //�¼��ڵ�
	public PlanNode first;    //ͬ����һ���ڵ�
	public PlanNode last;     //ͬ�����һ���ڵ�
	public PlanNode next;     //ͬ����һ���ڵ�
	public int childnum;      //�¼��ڵ�����
	public SQLResults  resultCache; //���������
	public int execStatus = 0; // 0, not executed, 1: not fully executed  2: fully executed 
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
	
	public void execute() { //���㱾�ڵ��SQLResult �����
		
	}
}
