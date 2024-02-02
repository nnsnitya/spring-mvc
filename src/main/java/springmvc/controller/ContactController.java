package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Spring MVC");
		m.addAttribute("Desc", "This is Spring MVC course");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("creating form....");
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id: "+createdUser);
		return "success";
	}
	
	/*@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("password") String userPassword, Model model)
	{
		
		System.out.println("User email: "+userEmail);
		System.out.println("User Name: "+userName);
		System.out.println("User Password: "+userPassword);
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		System.out.println(user);
		
		
		//model.addAttribute("email",userEmail);
		//model.addAttribute("name", userName);
		//model.addAttribute("password", userPassword);
		model.addAttribute("user",user);
		return "success";
	}*/
}
