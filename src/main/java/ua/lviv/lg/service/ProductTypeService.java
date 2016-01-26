package ua.lviv.lg.service;

import java.util.List;

import ua.lviv.lg.entity.ChildrensClothing;
import ua.lviv.lg.entity.ProductType;

public interface ProductTypeService {
	void insertProductType(String productType);
	void updateProductType(String productType);
	void deleteProductType(String productType);
	List<ProductType> findAll();
	void findById(int id);

}
