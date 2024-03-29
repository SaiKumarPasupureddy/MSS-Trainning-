package com.basic.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	code c;

	@GetMapping("/fetch/{id}")
	List<Map<String, Object>> selection(@PathVariable int id){
		
		return c.view(id);
	}
}
