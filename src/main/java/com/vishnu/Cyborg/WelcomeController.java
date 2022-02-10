package com.vishnu.Cyborg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/home")
	public String welcome() {
		return "index.jsp";
	}

}
