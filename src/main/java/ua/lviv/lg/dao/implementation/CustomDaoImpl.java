package ua.lviv.lg.dao.implementation;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lg.entity.Custom;
import ua.lviv.lg.dao.CustomDao;
@Repository
public class CustomDaoImpl implements CustomDao{
	@PersistenceContext(unitName="Primary")
	private EntityManager em;

	@Transactional
	public void saveCustom(Custom custom){
		em.persist(custom);
	}
	@Transactional
	public void updateCustom(Custom custom){
		em.merge(custom);
	}
	@Transactional
	public void deleteCustom(Custom custom){
		em.merge(custom);
	}
	@Transactional
	public List<Custom> findAll(){
		return em.createQuery("from Custom").getResultList();
			}
	@Transactional
	public Custom findCustomById(int id){
		return em.find(Custom.class, id);
	}
	@Transactional
	public List<Custom> findCustomByDate(Date date){
		return em.createNamedQuery("Custom.findCustomByDate", Custom.class).setParameter("date", date).getResultList();
			}
	@Transactional
public List<Custom> findCustomByQuantity(int quantity){
	return em.createNamedQuery("Custom.findCustomByQuantity", Custom.class).setParameter("quantity", quantity).getResultList();
	
}

}
