package ua.lviv.lg.controller;


import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lg.entity.Custom;
import ua.lviv.lg.entity.ProductType;
import ua.lviv.lg.service.ProductTypeService;

@Controller
public class ProductTypeController {
@Autowired
	private ProductTypeService productTypeService;

@RequestMapping(value="/showAllProductType")
public String findProductType(Model model){
	List<ProductType> allProductTypes=productTypeService.findAll();
	model.addAttribute("productTypes", allProductTypes);
	return "productType-all";
}
@RequestMapping(value="/createNewProductType")
public String createProductTypePage(){
	return "productType-new";
}
@RequestMapping(value="/createProductType", method = RequestMethod.POST)
public String createProductType(@RequestParam(value = "productType") String productType
		){
	productTypeService.insertProductType(productType);
	return "redirect:/showAllProductType";
}
}
