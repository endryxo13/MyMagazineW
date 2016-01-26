package ua.lviv.lg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String home(){
		return "home";
	}
	@RequestMapping(value = "/loginpage")
	public String loginPage(){
		return "loginpage";
	}
	
	@RequestMapping(value = "/contact")
	public String Contact(){
		return "Contact";
	}
	@RequestMapping(value = "/aboutUs")
	public String aboutUs(){
		return "aboutUs";
	}
}
