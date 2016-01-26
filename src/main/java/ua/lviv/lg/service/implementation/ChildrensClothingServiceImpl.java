package ua.lviv.lg.service.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.hql.internal.ast.TypeDiscriminatorMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.DTO.TypeChildrensClothingDTO;
import ua.lviv.lg.dao.ChildrensClothingDao;
import ua.lviv.lg.dao.ProductTypeDao;
import ua.lviv.lg.entity.ChildrensClothing;
import ua.lviv.lg.entity.ProductType;
import ua.lviv.lg.service.ChildrensClothingService;
@Service
public class ChildrensClothingServiceImpl implements ChildrensClothingService {
	@Autowired
	private ProductTypeDao productTypeDao;
	@Autowired
private	ChildrensClothingDao chilclothing;
	
	@Transactional
	public List<TypeChildrensClothingDTO> findAll() {
	List<TypeChildrensClothingDTO> typeChildrensClothing=new ArrayList<TypeChildrensClothingDTO>();
	List<ChildrensClothing> allChildrensClothing=chilclothing.findAll();
	for (ChildrensClothing childrensClothing : allChildrensClothing) {
		TypeChildrensClothingDTO typeChildrensClothingDTO=new TypeChildrensClothingDTO(childrensClothing.getPrice(),
				childrensClothing.getAvailability(),
				childrensClothing.getType().getProductType());
		typeChildrensClothing.add(typeChildrensClothingDTO);
		}
		return typeChildrensClothing;
	}
@Transactional
	public void insertChildrensClothing(String price, String availability,String productType) {
	ChildrensClothing childrensClothing= new ChildrensClothing(Float.parseFloat(price), availability);
	childrensClothing.setType(productTypeDao.findByProductType(productType));
		chilclothing.insertChildrensClothing(childrensClothing);
			
	}
@Transactional
	public void updateChildrensClothing(String price, String availability,String productType) {
	ChildrensClothing childrensClothing= new ChildrensClothing(Float.parseFloat(price), availability);
	childrensClothing.setType(productTypeDao.findByProductType(productType));
	chilclothing.updateChildrensClothing(childrensClothing);
	}
@Transactional
	public void deleteChildrensClothing(String price, String availability,String productType) {
	ChildrensClothing childrensClothing= new ChildrensClothing(Float.parseFloat(price), availability);
	childrensClothing.setType(productTypeDao.findByProductType(productType));
	chilclothing.deleteChildrensClothing(childrensClothing);
	}

@Transactional
	public void findById(int id) {
		chilclothing.findById(id);
			}
@Transactional
	public void findPrice(float price) {
		chilclothing.findPrice(price);
			}
@Transactional
	public void availability(String availability) {
		chilclothing.availability(availability);
			}

}
