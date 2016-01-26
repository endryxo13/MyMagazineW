package ua.lviv.lg.dao;

import java.util.List;

import ua.lviv.lg.entity.Buyer;

public interface BuyerDao {
	void insertBuyer(Buyer buyer);
	void updateBuyer(Buyer buyer);
	void deleteBuyer(Buyer buyer);
	List<Buyer> findAll();
	Buyer findBuyerById(int id);
	List<Buyer> findBuyerByCity(String city);
	Buyer findByUserName(String email);

}
