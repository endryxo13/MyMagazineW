package ua.lviv.lg.service.implementation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.dao.CustomDao;
import ua.lviv.lg.entity.Buyer;
import ua.lviv.lg.entity.Custom;
import ua.lviv.lg.service.CustomService;

@Service
public class CustomServiceImpl implements CustomService{
	@Autowired
private CustomDao customDao;
@Transactional
	public void saveCustom(String date,String quantity){
	DateFormat df = new SimpleDateFormat("yy-mm-dd");

	try {
		customDao.saveCustom(new Custom(df.parse(date),Integer.parseInt( quantity)));
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			}
@Transactional
	public void updateCustom(String date,String quantity){
	DateFormat df = new SimpleDateFormat("yy-mm-dd");
	try {
		customDao.updateCustom(new Custom(df.parse(date), Integer.parseInt( quantity)));
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
@Transactional
	public void deleteCustom(String date,String quantity){
	DateFormat df = new SimpleDateFormat("yy-mm-dd");
	try {
		customDao.deleteCustom(new Custom(df.parse(date), Integer.parseInt( quantity)));
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
@Transactional
	public List<Custom> findAll(){
		return customDao.findAll();
			}
@Transactional
	public Custom findCustomById(int id){
		return customDao.findCustomById(id);
			}
@Transactional
	public List<Custom> findCustomByDate(Date date){
		return customDao.findCustomByDate(date);
			}
@Transactional
	public List<Custom> findCustomByQuantity(int quantity){
		return customDao.findCustomByQuantity(quantity);
	}
	
}
