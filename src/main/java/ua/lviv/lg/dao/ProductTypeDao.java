package ua.lviv.lg.dao;

import java.util.List;

import ua.lviv.lg.entity.ChildrensClothing;
import ua.lviv.lg.entity.ProductType;

public interface ProductTypeDao {
	void insertProductType(ProductType productTyped);
	void updateProductType(ProductType productType);
	void deleteProductType(ProductType productType);
	List<ProductType> findAll();
	void findById(int id);
	ProductType findByProductType(String productType);

}
