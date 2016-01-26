package ua.lviv.lg.service;

import java.util.List;

import ua.lviv.lg.entity.Buyer;

public interface BuyerService {
	
	void insertBuyer(String firstName, String lastName, String telefonNumber, String city, String email, String password);
	void updateBuyer(String firstName, String lastName, String telefonNumber, String city, String email,String password);
	void deleteBuyer(String firstName, String lastName, String telefonNumber, String city, String email,String password);
	List<Buyer> findAll();
	Buyer findBuyerById(int id);
	List<Buyer> findBuyerByCity(String city);
}
