package com.basic.jdbc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class code {
	@Autowired
	JdbcTemplate jt;
	int createtable(pojo obj) {
		String tablename=obj.getTablename();
		Map<String,String> hm=obj.getHm();
		String sql="create table "+tablename+"(";
		int size=hm.size();
		for(Map.Entry<String, String> i:hm.entrySet()) {
		sql=sql+i.getKey()+" "+i.getValue();
		if(size--!=1)
			sql=sql+",";
		else
			sql=sql+")";
		}
		try {
			jt.execute(sql);
			return 1;
		}
		catch(Exception e) {
			return 2;
		}
	}
}
