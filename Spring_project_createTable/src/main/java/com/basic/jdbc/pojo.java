package com.basic.jdbc;

import java.util.Map;

public class pojo {
	String tablename;
	Map<String,String> hm;
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public Map<String, String> getHm() {
		return hm;
	}
	public void setHm(Map<String, String> hm) {
		this.hm = hm;
	}
}
