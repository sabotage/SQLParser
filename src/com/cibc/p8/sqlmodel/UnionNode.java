package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public class UnionNode {
   public ArrayList itemlist ; //union �����select �ֶ��б�
   public ArrayList orderbylist; //order �б� ���Ⱥ�˳��
   public String sel_limit; //limit
   public String offset_limit; //limit offset
   public ArrayList  msql_query;// �·���DB��sql �б� 
   
}
