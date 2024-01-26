package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	
}
