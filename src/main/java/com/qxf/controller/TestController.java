package com.qxf.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qxf.model.Person;
@RestController
public class TestController {

	@RequestMapping(value="/search",produces={MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		
		return new Person(personName, 32, "hefei");
		
	}
}
