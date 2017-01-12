package com.cibc.p8.sqlmodel;

import java.util.ArrayList;
import java.util.Iterator;

import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;
import com.cibc.p8.sqlmodel.AbstractNode.NODETYPE;

public class SQLNode extends PlanNode {   //�Ӳ�ѯ�ڵ�
	public ArrayList<String> itemlist;  //SQLNode��Ӧ��select�ֶ�
	public JoinNode join;  //SQLNode��Ӧ��join_list
	public ArrayList<String> tablelist; //��Ӧ��table_list
	public AbstractNode  whereconditions; //��Ӧ��WHERE
	public AbstractNode  havingconditions; //��Ӧ��having
	public int selectlimit; //SQLNode��Ӧ��limit
	public int offsetlimit; //SQLNode��Ӧ��offset
	public ArrayList<String> grouplist; //SQLNode��Ӧ��group by
	public ArrayList<String> orderlist; //SQLNode��Ӧ��order by

	private ArrayList dbList;  //sql����ִ�е�db�ڵ�
	private String distributetype; // �ַ�������
	private String distributedkey; // �ַ���
	MergeNode merged_subwhere;  //���Ժ͵�ǰSQL�ϲ��·���where �Ӳ�ѯ
	MergeNode unmerged_subwhere; //�����Ժ͵�ǰSQL �ϲ��·���where �Ӳ�ѯ
	MergeNode merged_subfrom; //���Ժ͵�ǰSQL�ϲ��·���from�Ӳ�ѯ
	MergeNode unmerged_subfrom; //�����Ժ͵�ǰSQL�ϲ��·���from�Ӳ�ѯ
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		sqlString = "select ";
		
		Iterator<String> it = itemlist.iterator();
		while (it.hasNext()) {
			sqlString += " " + it.next();
			if (it.hasNext()) {
				sqlString +=",";
			}
		}
		sqlString += " from " ;
		if (this.join == null) {
			it = tablelist.iterator();
			while (it.hasNext()) {
				sqlString += it.next() +" ";
				if (it.hasNext()) {
					sqlString +=",";
				}
			}
		}else {
			sqlString += join.getString();
		}
		
		sqlString += " where ";
		sqlString += this.whereconditions.getString();
		if (this.orderlist != null) {
			sqlString += " order by ";
			it = orderlist.iterator();
			while (it.hasNext()) {
				String order = it.next();
				sqlString += order + " ";
				if (it.hasNext()) {
					sqlString +=",";
				}
			}
		}
		
		if (this.grouplist != null) {
			sqlString += " group by ";
			it = grouplist.iterator();
			while (it.hasNext()) {
				String group = it.next();
				sqlString += group + " ";
				if (it.hasNext()) {
					sqlString +=",";
				}
			}
		}
		
		
		return sqlString;
	}
	
}
