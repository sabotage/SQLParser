package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public class SQLNode implements AbstractNode {
	public ArrayList itemlist;  //SQLNode��Ӧ��select�ֶ�
	public ArrayList joinlist;  //SQLNode��Ӧ��join_list
	public ArrayList tablelist; //��Ӧ��table_list
	public ArrayList whereconditions; //��Ӧ��WHERE
	public ArrayList havingconditions; //��Ӧ��having
	public ArrayList selectlimit; //SQLNode��Ӧ��limit
	public ArrayList offsetlimit; //SQLNode��Ӧ��offset
	public ArrayList grouplist; //SQLNode��Ӧ��group by
	public ArrayList orderlist; //SQLNode��Ӧ��order by

	private ArrayList dbList;  //sql����ִ�е�db�ڵ�
	private ArrayList resultCache; // sql�����������
	private String distributetype; // �ַ�������
	private String distributedkey; // �ַ���
	MergeNode merged_subwhere;  //���Ժ͵�ǰSQL�ϲ��·���where �Ӳ�ѯ
	MergeNode unmerged_subwhere; //�����Ժ͵�ǰSQL �ϲ��·���where �Ӳ�ѯ
	MergeNode merged_subfrom; //���Ժ͵�ǰSQL�ϲ��·���from�Ӳ�ѯ
	MergeNode unmerged_subfrom; //�����Ժ͵�ǰSQL�ϲ��·���from�Ӳ�ѯ
	@Override
	public String getSQLString() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public NODETYPE getNodeType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList exec() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
