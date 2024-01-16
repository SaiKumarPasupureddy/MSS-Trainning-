package com.basic.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class code {
	@Autowired
	JdbcTemplate jt;
	List<Map<String, Object>> view(int id) {
		String sql = "select * from ITG_165_Emp where empId = ?";
		List<Map<String, Object>> list = null;
		try {
			list = jt.queryForList(sql, id);
			System.out.println(list.size());
		}
		catch(Exception e) {
			System.out.println("Error: "+e.toString());
		}
		return list;
	}
}