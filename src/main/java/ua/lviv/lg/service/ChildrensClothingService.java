package ua.lviv.lg.service;

import java.util.List;

import ua.lviv.lg.DTO.TypeChildrensClothingDTO;
import ua.lviv.lg.entity.ChildrensClothing;

public interface ChildrensClothingService {
	 void insertChildrensClothing(String price, String availability, String productType) ;
	void updateChildrensClothing(String price, String availability,String productType);
	 void deleteChildrensClothing(String price, String availability,String productType);
	List<TypeChildrensClothingDTO> findAll();
	void findById(int id);
	void findPrice(float price);
	void availability(String availability);


}
