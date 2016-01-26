package ua.lviv.lg.dao.implementation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lg.entity.Buyer;
import ua.lviv.lg.dao.BuyerDao;
@Repository
public class BuyerDaoImpl implements BuyerDao {
	@PersistenceContext(unitName="Primary")
	private EntityManager em;
	@Transactional
	public void insertBuyer(Buyer buyer){
		em.persist(buyer);
	}
	@Transactional
	public void updateBuyer(Buyer buyer){
		em.merge(buyer);
	}
	@Transactional
	public void deleteBuyer(Buyer buyer){
		em.remove(buyer);
			}
	@Transactional
	public List<Buyer> findAll(){
		return em.createQuery("from Buyer").getResultList();
	}
	@Transactional
	public Buyer findBuyerById(int id){
		return em.find(Buyer.class, id);
		}
	@Transactional
public List<Buyer> findBuyerByCity(String city){
	return  em.createNamedQuery("Buyer.findBuyerByCity",Buyer.class).setParameter("city", city).getResultList();
	}
	@Transactional
	public Buyer findByUserName(String userName) {
			return em.createQuery("select b from Buyer b where b.email like :userName", Buyer.class).setParameter("userName", userName).getSingleResult();
	}
}


