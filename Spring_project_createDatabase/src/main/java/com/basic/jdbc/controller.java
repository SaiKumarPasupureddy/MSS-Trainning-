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
	@PostMapping("/c-DB")
	String create(@RequestBody pojo obj) {
		return c.createDatabase(obj);
	}
}
