package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	/*@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/enjoy";
	}*/
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is second handler[enjoy]");
		return "contact";
	}
	
}
