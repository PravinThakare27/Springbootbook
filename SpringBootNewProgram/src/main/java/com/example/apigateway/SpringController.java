package com.example.apigateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@Autowired 
	Springservice springser;
@GetMapping("/getwelcome")
public String Welcome() {
	return "Welcome BHailog";
}
@GetMapping("/bye")
public String Bye() {
	return "Bye Bhailog";
}

@GetMapping("/getbookdetail")
public List<Book>  getbookdetail(){
	return springser.getallbook();
	
}


}
