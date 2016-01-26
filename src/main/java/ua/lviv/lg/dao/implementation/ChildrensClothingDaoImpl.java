package ua.lviv.lg.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.dao.ChildrensClothingDao;
import ua.lviv.lg.entity.ChildrensClothing;

@Repository
public class ChildrensClothingDaoImpl implements ChildrensClothingDao{
	@PersistenceContext(unitName="Primary")
	private EntityManager em;
	
	
	@Transactional
	public void insertChildrensClothing(ChildrensClothing ChildrensClothing){
		em.persist(ChildrensClothing);

	}
	@Transactional
	public void updateChildrensClothing(ChildrensClothing ChildrensClothing){
		em.merge(ChildrensClothing);
	}
	@Transactional
	public void deleteChildrensClothing(ChildrensClothing ChildrensClothing){
		em.remove(ChildrensClothing);
		
	}
	@Transactional
	public List<ChildrensClothing> findAll(){
        return em.createQuery("from ChildrensClothing").getResultList();
    }
	
	@Transactional
	public void findById(int id){
		em.find(ChildrensClothing.class, id);
	}
	
	@Transactional
	public void findPrice(float price){
		em.createQuery("ChildrensClothing.findPrice", ChildrensClothing.class).setParameter("price", price);
	}
	
	@Transactional
	public void availability(String availability){
		em.createQuery("ChildrensClothing.availability",ChildrensClothing.class ).setParameter("availability", availability);
	}



}
