package ua.lviv.lg.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lg.dao.ProductTypeDao;
import ua.lviv.lg.entity.ChildrensClothing;
import ua.lviv.lg.entity.ProductType;
import ua.lviv.lg.service.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{
	
	private List<ProductType> productT=new ArrayList<ProductType>();
	@Autowired
	ProductTypeDao Ptype;
	

	public void insertProductType(String productType) {
		ProductType productTyped= new ProductType(productType);
		Ptype.insertProductType(productTyped);
	}
	public void updateProductType(String productType) {
		ProductType productTyped= new ProductType(productType);
		Ptype.updateProductType(productTyped);
		
	}

	public void deleteProductType(String productType) {
		ProductType productTyped= new ProductType(productType);
		Ptype.deleteProductType(productTyped);
		
	}

	public List<ProductType> findAll() {
		return Ptype.findAll();
	}

	public void findById(int id) {
		Ptype.findById(id);
		
	}

}
