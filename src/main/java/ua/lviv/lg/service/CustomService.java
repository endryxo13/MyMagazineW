package ua.lviv.lg.service;

import java.util.Date;
import java.util.List;

import ua.lviv.lg.entity.Custom;

public interface CustomService {
	 void saveCustom(String date,String quantity);
	 void updateCustom(String date,String quantity);
	 void deleteCustom(String date,String quantity);
	List<Custom> findAll();
	Custom findCustomById(int id);
	List<Custom> findCustomByDate(Date date);
	List<Custom> findCustomByQuantity(int quantity);
}
