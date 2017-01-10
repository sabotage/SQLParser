package com.cibc.p8.complexsql.util;


public class Logger {

	public static final int DEBUG = 1;
	public static final int INFO =2;

	public static void log(int level, String msg){
		System.out.println(msg);
	}
	
}

