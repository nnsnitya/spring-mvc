package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Nityanand Singh");
		model.addAttribute("id",12345);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Pankaj");
		friends.add("Virendra");
		friends.add("Premshanker");
		model.addAttribute("f", friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	
	//Services
	//help
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		LocalDateTime now = LocalDateTime.now();
		
		//creating ModelAndView Object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Premshanker Kushwaha");
		modelAndView.addObject("rollNumber",12345);
		modelAndView.addObject("time",now);
		
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
