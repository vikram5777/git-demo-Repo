package com.springview1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController1 {

	@GetMapping("/hm")
	public String getHome() {
		System.out.println("home handeller");
		return "home";
	}

	@GetMapping("/h")
	public String getjsp() {
		System.out.println("home handeller");
		return "contact";
	}
	
	@GetMapping("/hmm")
	public String getjsp1() {
		System.out.println("home handeller");
		return "contact";
	}
	@GetMapping("/hmmm")
	public String getjsp2() {
		System.out.println("home handeller");
		return "contact";
	}
}
