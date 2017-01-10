package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

public class UnionNode {
   public ArrayList itemlist ; //union 对外的select 字段列表
   public ArrayList orderbylist; //order 列表， 按先后顺序
   public String sel_limit; //limit
   public String offset_limit; //limit offset
   public ArrayList  msql_query;// 下发到DB的sql 列表 
   
}
