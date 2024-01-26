package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
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
		
		
		/*model.addAttribute("email",userEmail);
		model.addAttribute("name", userName);
		model.addAttribute("password", userPassword);*/
		model.addAttribute("user",user);
		return "success";
	}
}
