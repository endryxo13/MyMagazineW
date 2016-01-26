package ua.lviv.lg.dao;

import java.util.Date;
import java.util.List;

import ua.lviv.lg.entity.Custom;

public interface CustomDao {
	void saveCustom(Custom custom);
	void updateCustom(Custom custom);
	void deleteCustom(Custom custom);
	List<Custom> findAll();
	Custom findCustomById(int id);
	List<Custom> findCustomByDate(Date date);
	List<Custom> findCustomByQuantity(int quantity);
}
