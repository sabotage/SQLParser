package com.cibc.p8.complexsql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;



public class SQLModel {
	

	private HashMap<String, ArrayList<String>> tablepartitions = new HashMap<String, ArrayList<String>>();
	private ArrayList<String> partitions = new ArrayList<String>();
	public ArrayList<String> getPartitions() {
		return partitions;
	}
	public void setPartitions(ArrayList<String> partitions) {
		this.partitions = partitions;
	}
	
	public ArrayList getTablepartitions (String table) {
		return  tablepartitions.get(table);
	}
	public void setTablePartitions (String table, ArrayList partitions) {
		tablepartitions.put(table, partitions);
	}
	public String[] getTables () {
		String [] result = new String [tablepartitions.keySet().size()];
		return tablepartitions.keySet().toArray(result);
	}
	
	
}
