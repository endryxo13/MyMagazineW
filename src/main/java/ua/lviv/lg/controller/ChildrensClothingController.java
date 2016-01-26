package ua.lviv.lg.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lg.DTO.TypeChildrensClothingDTO;
import ua.lviv.lg.entity.ChildrensClothing;
import ua.lviv.lg.entity.Custom;
import ua.lviv.lg.service.ChildrensClothingService;
@Controller
public class ChildrensClothingController {
@Autowired
	private ChildrensClothingService childrensClothingService;
@RequestMapping(value="/showAllChildrensClothing")
public String findChildrensClothing(Model model){
	List<TypeChildrensClothingDTO> allChildrensClothings=childrensClothingService.findAll();
	model.addAttribute("childrensClothings", allChildrensClothings);
	return "childrensClothing-all";
}
@RequestMapping(value="/createNewChildrensClothing")
public String createChildrensClothingPage(){
	return "childrensClothing-new";
}
@RequestMapping(value="/createChildrensClothing", method = RequestMethod.POST)
public String createChildrensClothing(@RequestParam(value = "price") String price,
		@RequestParam(value ="availability") String availability,
		@RequestParam(value="productType") String productType)
		{
	childrensClothingService.insertChildrensClothing(price, availability, productType);
	return "redirect:/showAllChildrensClothing";
}
}
