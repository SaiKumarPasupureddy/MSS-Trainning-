package com.basic.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	code c;
	@PostMapping("/c-TB")
	Map createtable(@RequestBody pojo obj){
	Map<String,String> hm=new HashMap<>();
		int i=c.createtable(obj);
		if(i==1)
			hm.put("1","Done");
		else
			hm.put("2","not Done");
		return hm;
	}
}
