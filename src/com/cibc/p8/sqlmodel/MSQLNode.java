package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

import com.cibc.p8.sqlmodel.AbstractNode.ELEMENTTYPE;
import com.cibc.p8.sqlmodel.AbstractNode.NODETYPE;

public class MSQLNode extends PlanNode{
	   public ArrayList unionList;//
	   public ArrayList itemlist ; //union �����select �ֶ��б�
	   public ArrayList orderbylist; //order �б� ���Ⱥ�˳��
	   public String sel_limit; //limit
	   public ArrayList grouplist; //SQLNode��Ӧ��group by
	   public String offset_limit; //limit offset

		@Override
		public String getString() {
			// TODO Auto-generated method stub
			sqlString = "";
			
			return sqlString;
		}
		
}
