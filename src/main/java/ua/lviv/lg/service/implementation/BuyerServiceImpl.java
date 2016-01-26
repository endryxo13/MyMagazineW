package ua.lviv.lg.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.dao.BuyerDao;
import ua.lviv.lg.entity.Buyer;
import ua.lviv.lg.service.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService {
	@Autowired
	private BuyerDao buyerDao;
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Transactional
	public void insertBuyer(String firstName, String lastName, String telefonNumber, String city, String email, String password){
			buyerDao.insertBuyer(new Buyer(firstName, lastName, Integer.parseInt(telefonNumber), city, email, encoder.encode(password)));
	}
@Transactional
	public void updateBuyer(String firstName, String lastName, String telefonNumber, String city, String email,String password){
	buyerDao.updateBuyer(new Buyer(firstName, lastName, Integer.parseInt(telefonNumber), city, email,encoder.encode(password)));
					}
@Transactional
	public void deleteBuyer(String firstName, String lastName, String telefonNumber, String city, String email,String password){
		buyerDao.deleteBuyer(new Buyer(firstName, lastName,  Integer.parseInt(telefonNumber), city, email,encoder.encode(password)));
			}
@Transactional
	public List<Buyer> findAll(){
		return buyerDao.findAll();
	}
@Transactional
public List<Buyer> findBuyerByCity(String city){
	return buyerDao.findBuyerByCity(city);
	}
@Transactional
public Buyer findBuyerById(int id){
	return buyerDao.findBuyerById(id);
}
}

