package ua.lviv.lg.dao;

import java.util.List;

import ua.lviv.lg.entity.ChildrensClothing;

public interface ChildrensClothingDao {
	void insertChildrensClothing(ChildrensClothing childrensClothing);
	void updateChildrensClothing(ChildrensClothing childrensClothing);
	void deleteChildrensClothing(ChildrensClothing childrensClothing);
	List<ChildrensClothing> findAll();
	void findById(int id);
	void findPrice(float price);
	void availability(String availability);

	

}
