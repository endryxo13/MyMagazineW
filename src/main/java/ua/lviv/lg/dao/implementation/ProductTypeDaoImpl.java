package ua.lviv.lg.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.dao.ProductTypeDao;
import ua.lviv.lg.entity.ChildrensClothing;
import ua.lviv.lg.entity.ProductType;

@Repository
public class ProductTypeDaoImpl implements ProductTypeDao{
	
	@PersistenceContext(unitName="Primary")
	private EntityManager em;

	
	@Transactional
	public void insertProductType(ProductType productType){
		em.persist(productType);
	}
	@Transactional
	public void updateProductType(ProductType productType){
		em.merge(productType);
	}
	@Transactional
	public void deleteProductType(ProductType productType){
		em.remove(productType);
			}

	@Transactional
	public List<ProductType> findAll() {
		return em.createQuery("from ProductType").getResultList();
	}
	
		@Transactional
	public void findById(int id){
		em.find(ProductType.class, id);
	}
		@Transactional
		public ProductType findByProductType(String productType) {
			return (ProductType) em
					.createQuery(
							"select p from ProductType p where p.productType like :productType")
					.setParameter("productType", productType).getSingleResult();
		}

}
