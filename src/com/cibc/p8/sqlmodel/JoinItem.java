package com.cibc.p8.sqlmodel;

import java.util.ArrayList;
import java.util.Iterator;

public class JoinItem implements AbstractNode {

	public ArrayList<AbstractNode> joinlist;  //join list
//	public ArrayList<TableItem> tablelist; //table list	
	public LogicalExpression OnCondition;
	public String using; // using item
	public JOINTYPE jointype;   // inner,  left, right
	public String stratagy; // INDEX_NEXT_LOOP, HASH, 
	
	
	public enum JOINTYPE {
		LEFTJOIN, RIGHTJOIN, INNERJOIN
	}
	
	@Override
	public String getExecString() {
		// TODO Auto-generated method stub
		String result = "";
		if (joinlist != null) {
			Iterator it = joinlist.iterator();
			while (it.hasNext()) {
				AbstractNode n = (AbstractNode) it.next();
				if (n instanceof SQLNode) {
					result += "(" + n.getExecString() + ")";
				}else {
				    result  +=  n.getExecString();
				}
				if (it.hasNext()) {
					if (this.jointype == this.jointype.LEFTJOIN) {
						result += " LEFT JOIN ";
					}else if (this.jointype == this.jointype.RIGHTJOIN) {
						result += " RIGHT JOIN ";
					}else if (this.jointype == this.jointype.INNERJOIN) {
						result += " INNER JOIN ";
					}
					
				}
			}
		}
		if (this.OnCondition != null) {
			result = result+ " ON "+ this.OnCondition.getString();
		}
		if (this.using != null) {
			result += " USING(" + using + ")"; 
		}
			
		return result;
		
	}

	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		String result = "";
		if (joinlist != null) {
			if (this.jointype == this.jointype.LEFTJOIN) {
				result += " LEFT JOIN ";
			}else if (this.jointype == this.jointype.RIGHTJOIN) {
				result += " RIGHT JOIN ";
			}else if (this.jointype == this.jointype.INNERJOIN) {
				result += " INNTER JOIN ";
			}
			
		
		//	Iterator it = joinlist.iterator();
		//	while (it.hasNext()) {
			if (joinlist.size()>0) {
				AbstractNode n = joinlist.get(0);
				if (n instanceof SQLNode) {
					result += "(" + n.getString() + ")";
				}else {
				    result  +=  n.getString();
				}
			}
			//	if (it.hasNext()) {
			//		result += ",";
			//	}
			
		}
		if (this.OnCondition != null) {
		result = result + " ON "+ this.OnCondition.getString();
		}
		if (this.using != null) {
			result += " USING(" + using +")";
		}
		return result;
		
	}

	@Override
	public ELEMENTTYPE getElementType() {
		// TODO Auto-generated method stub
		return ELEMENTTYPE.JOIN;
	}

}
