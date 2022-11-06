package check.myproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import check.spring.microservice.lib.Mylib;

@RestController
public class FirstController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	
		
}
