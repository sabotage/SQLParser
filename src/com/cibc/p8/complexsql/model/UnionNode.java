package com.cibc.p8.complexsql.model;

import java.util.ArrayList;

public class UnionNode extends SqlNode {

	private ArrayList <SqlNode> nodes;

	public ArrayList<SqlNode> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<SqlNode> nodes) {
		this.nodes = nodes;
	}
}
