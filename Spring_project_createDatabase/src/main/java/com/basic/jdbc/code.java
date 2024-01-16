package com.basic.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class code {
	@Autowired
	JdbcTemplate jt;
	String createDatabase(pojo obj) {
		String database=obj.getDatabaseName();
		String sql= "create database "+database;
		try {
			jt.execute(sql);
			return "Success";
		}
		catch(Exception e) {
			return "Failed: "+e.toString();
		}
	}
}
