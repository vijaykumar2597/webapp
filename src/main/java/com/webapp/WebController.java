package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping(value="/name")
	public String getName() {
		return "Vijay Kumar";
	}

}
