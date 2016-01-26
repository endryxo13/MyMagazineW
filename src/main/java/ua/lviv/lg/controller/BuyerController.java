package ua.lviv.lg.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lg.entity.Buyer;
import ua.lviv.lg.service.BuyerService;


@Controller
public class BuyerController {
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping(value="/findAllBuyers")
	public String findBuyers(Model model){
		List<Buyer> allBuyer=buyerService.findAll();
		model.addAttribute("buyers", allBuyer);
		return "buyer-all";
	}
	@RequestMapping(value="/registr")
public String  registrBuyerPage(){
	return "buyer-new";
}
	@RequestMapping(value="/registrBuyer", method = RequestMethod.POST)
public String  registrBuyer(@RequestParam(value = "firstName") String firstName,
		@RequestParam(value = "lastName") String lastName,
		@RequestParam(value = "telefonNumber") String telefonNumber,
		@RequestParam(value = "city") String city,
		@RequestParam(value = "email") String email,
        @RequestParam(value = "password") String password){
		buyerService.insertBuyer(firstName, lastName, telefonNumber, city, email,password);

		return "redirect:/findAllBuyers";
		
	}

}
