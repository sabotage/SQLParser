package com.cibc.p8.sqlmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.cibc.p8.complexsql.SQLModel.PARSING_STAGE;
import com.cibc.p8.complexsql.SQLModel.SUBSTAGE;
import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;
import com.cibc.p8.sqlmodel.AbstractNode.NODETYPE;

public class SQLNode extends PlanNode {   //�Ӳ�ѯ�ڵ�
	public ArrayList<String> itemlist;  //SQLNode��Ӧ��select�ֶ�
	public ArrayList<JoinItem> joinlist;  //SQLNode��Ӧ��join_list
	public ArrayList<TableItem> tablelist; //��Ӧ��table_list
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
		if (itemlist == null) {
			return "";
		}
		Iterator it = itemlist.iterator();
		while (it.hasNext()) {
			sqlString += " " + it.next();
			if (it.hasNext()) {
				sqlString +=",";
			}
		}
		sqlString += " from " ;
		if (this.tablelist != null) {
			it = tablelist.iterator();
			while (it.hasNext()) {
				sqlString += ((TableItem)it.next()).getString() ;
				if (it.hasNext()) {
					sqlString +=",";
				}
			}
		}
		if (this.joinlist != null){
			it = joinlist.iterator();
			while (it.hasNext()) {
				JoinItem ji = (JoinItem)it.next();
				sqlString += ji.getString();
			}
		}
		
		
		if (this.whereconditions != null) {
			sqlString += " where ";
		
		sqlString += this.whereconditions.getString();
			if (this.orderlist != null) {
				sqlString += " order by ";
				it = orderlist.iterator();
				while (it.hasNext()) {
					String order = (String)it.next();
					sqlString += order + " ";
					if (it.hasNext()) {
						sqlString +=",";
					}
				}
			}
		}
		if (this.grouplist != null) {
			sqlString += " group by ";
			it = grouplist.iterator();
			while (it.hasNext()) {
				String group = (String)it.next();
				sqlString += group + " ";
				if (it.hasNext()) {
					sqlString +=",";
				}
			}
		}
		
		
		return sqlString;
	}
	
	
	@Override
	public String getExecString() {
	    String exeString = "";
		if(this.execStatus == 2) {// not executed
		//	exeString += "(";
			Iterator it = this.resultCache.sqlresults.iterator();
			while (it.hasNext()) {
			 ArrayList v=(ArrayList)	it.next();
			 	Iterator it1 = v.iterator();
			 	while (it1.hasNext()) {
			 		String v1 = (String) it1.next();
			 		exeString += "\"" + v1 +"\"";
			 		if (it1.hasNext()) {
			 			exeString += ",";
			 		}
			 	}
			 	if (it.hasNext()) {
		 			exeString += ",";
		 		}	
			}
		//	exeString += ")";
			return exeString;
		}
		
		exeString = "select ";
		
		Iterator it = itemlist.iterator();
		while (it.hasNext()) {
			exeString += " " + it.next();
			if (it.hasNext()) {
				exeString +=",";
			}
		}
		exeString += " from " ;
		if (this.joinlist == null) {
			it = tablelist.iterator();
			while (it.hasNext()) {
				exeString += ((TableItem)it.next()).getString() ;
				if (it.hasNext()) {
					exeString +=",";
				}
			}
		}else {
			it = joinlist.iterator();
			while (it.hasNext()) {
				JoinItem ji = (JoinItem)it.next();
				exeString += ji.getString();
			}
		}

		
		exeString += " where ";
		exeString += this.whereconditions.getExecString();
		if (this.orderlist != null) {
			exeString += " order by ";
			it = orderlist.iterator();
			while (it.hasNext()) {
				String order = (String)it.next();
				exeString += order + " ";
				if (it.hasNext()) {
					exeString +=",";
				}
			}
		}
		
		if (this.grouplist != null) {
			exeString += " group by ";
			it = grouplist.iterator();
			while (it.hasNext()) {
				String group = (String)it.next();
				exeString += group + " ";
				if (it.hasNext()) {
					exeString +=",";
				}
			}
		}
		
		
		return exeString;
	}
	@Override
	public void execute() { //���㱾�ڵ��SQLResult �����
			//check where condition, could push down or not
	}
	
}
