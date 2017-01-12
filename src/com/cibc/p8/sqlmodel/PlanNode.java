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
	
	public void execute() { //���㱾�ڵ��SQLResult �����
		
	}
}
