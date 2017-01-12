package com.cibc.p8.sqlmodel;

import java.util.ArrayList;
import java.util.Iterator;

public class JoinNode implements AbstractNode {

	public ArrayList<AbstractNode> joinlist;  //join list
	public ArrayList<String> tablelist; //table list	
	public LogicalExpression OnCondition;
	
	public JOINTYPE jointype;   // inner,  left, right
	public String stratagy; // INDEX_NEXT_LOOP, HASH, 
	
	
	public enum JOINTYPE {
		LEFTJOIN, RIGHTJOIN, INNERJOIN
	}
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		String result = "";
		if (joinlist != null) {
			Iterator it = joinlist.iterator();
			while (it.hasNext()) {
				AbstractNode n = (AbstractNode) it.next();
				if (n instanceof SQLNode) {
					result += "(" + n.getString() + ")";
				}else {
				    result  +=  n.getString();
				}
				if (it.hasNext()) {
					if (this.jointype == this.jointype.LEFTJOIN) {
						result += " left join ";
					}else if (this.jointype == this.jointype.RIGHTJOIN) {
						result += " right join ";
					}else if (this.jointype == this.jointype.INNERJOIN) {
						result += " inner join ";
					}
					
				}
			}
		}
		return result;
		
	}

	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.JOIN;
	}

}
