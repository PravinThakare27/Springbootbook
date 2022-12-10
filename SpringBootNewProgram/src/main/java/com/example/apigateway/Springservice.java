package com.example.apigateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Springservice {
	@Autowired
	SpringJpaRepo spingjpa;
	
	@GetMapping("/getbookdetail")
	public List<Book> getallbook() {
		// TODO Auto-generated method stub
		return spingjpa.findAll();
	}
}
