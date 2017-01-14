package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;
import com.cibc.p8.sqlmodel.AbstractNode.NODETYPE;

public class MSQLNode extends PlanNode{
	   public ArrayList unionList;//
	   public ArrayList itemlist ; //union 对外的select 字段列表
	   public ArrayList orderbylist; //order 列表， 按先后顺序
	   public String sel_limit; //limit
	   public ArrayList grouplist; //SQLNode对应的group by
	   public String offset_limit; //limit offset

		@Override
		public String getString() {
			// TODO Auto-generated method stub
			sqlString = "";
			
			return sqlString;
		}
		
}
