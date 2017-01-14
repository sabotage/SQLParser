package com.cibc.p8.sqlmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.cibc.p8.complexsql.SQLModel.PARSING_STAGE;
import com.cibc.p8.complexsql.SQLModel.SUBSTAGE;
import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;
import com.cibc.p8.sqlmodel.AbstractNode.NODETYPE;

public class SQLNode extends PlanNode {   //子查询节点
	public ArrayList<String> itemlist;  //SQLNode对应的select字段
	public ArrayList<JoinItem> joinlist;  //SQLNode对应的join_list
	public ArrayList<TableItem> tablelist; //对应的table_list
	public AbstractNode  whereconditions; //对应的WHERE
	public AbstractNode  havingconditions; //对应的having
	public int selectlimit; //SQLNode对应的limit
	public int offsetlimit; //SQLNode对应的offset
	public ArrayList<String> grouplist; //SQLNode对应的group by
	public ArrayList<String> orderlist; //SQLNode对应的order by

	
	private ArrayList dbList;  //sql语句待执行的db节点
	private String distributetype; // 分发键类型
	private String distributedkey; // 分发键
	MergeNode merged_subwhere;  //可以和当前SQL合并下发的where 子查询
	MergeNode unmerged_subwhere; //不可以和当前SQL 合并下发的where 子查询
	MergeNode merged_subfrom; //可以和当前SQL合并下发的from子查询
	MergeNode unmerged_subfrom; //不可以和当前SQL合并下发的from子查询
	
	
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
	public void execute() { //计算本节点的SQLResult 结果集
			//check where condition, could push down or not
	}
	
}
