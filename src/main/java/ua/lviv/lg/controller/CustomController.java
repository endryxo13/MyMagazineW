package ua.lviv.lg.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lg.entity.Custom;
import ua.lviv.lg.service.CustomService;
@Controller
public class CustomController {
@Autowired
	private CustomService customService;
	@RequestMapping(value="/showAllCustom")
public String findCustom(Model model){
	List<Custom> allCustoms=customService.findAll();
	model.addAttribute("customs", allCustoms);
	return "custom-all";
}
@RequestMapping(value="/createNewCustom")
public String createCustomPage(){
	return "custom-new";
}
@RequestMapping(value="/createCustom", method = RequestMethod.POST)
public String createCustom(@RequestParam(value = "date") String date,
		@RequestParam(value ="quantity") String quantity
		){
	customService.saveCustom(date, quantity);
	System.out.println(date);
	return "redirect:/showAllCustom";
}
}
