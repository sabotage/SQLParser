package com.cibc.p8.sqlmodel;

import java.util.ArrayList;

import com.cibc.p8.sqlmodel.AbstractNode.NODETYPE;

public class SelectNode extends PlanNode {
	public NODETYPE getNodeType () {
		return NODETYPE.SELECT;
	}
	
	
}
