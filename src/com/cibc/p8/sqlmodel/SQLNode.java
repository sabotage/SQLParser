package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public class SQLNode implements AbstractNode {
	public ArrayList itemlist;  //SQLNode对应的select字段
	public ArrayList joinlist;  //SQLNode对应的join_list
	public ArrayList tablelist; //对应的table_list
	public ArrayList whereconditions; //对应的WHERE
	public ArrayList havingconditions; //对应的having
	public ArrayList selectlimit; //SQLNode对应的limit
	public ArrayList offsetlimit; //SQLNode对应的offset
	public ArrayList grouplist; //SQLNode对应的group by
	public ArrayList orderlist; //SQLNode对应的order by

	private ArrayList dbList;  //sql语句待执行的db节点
	private ArrayList resultCache; // sql语句结果集缓存
	private String distributetype; // 分发键类型
	private String distributedkey; // 分发键
	MergeNode merged_subwhere;  //可以和当前SQL合并下发的where 子查询
	MergeNode unmerged_subwhere; //不可以和当前SQL 合并下发的where 子查询
	MergeNode merged_subfrom; //可以和当前SQL合并下发的from子查询
	MergeNode unmerged_subfrom; //不可以和当前SQL合并下发的from子查询
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
