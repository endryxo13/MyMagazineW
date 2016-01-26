package ua.lviv.lg.entity;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@NamedQueries({
	@NamedQuery(name="Custom.findCustomByDate", query="select c from Custom c where c.date like :date"),
	@NamedQuery(name="Custom.findCustomByQuantity", query="select c from Custom c where c.quantity like :quantity")
})
public class Custom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int idCustom;
	@Column
	@Temporal(TemporalType.DATE)
private Date date;
private int quantity;
@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
private Buyer buyer;
@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY, mappedBy = "custom")
private List<ChildrensClothing>childc;
public Custom(){
	}
public Custom(Date date, int quantity) {
	super();
	this.date = date;
	this.quantity = quantity;
}
public Buyer getBuyer() {
	return buyer;
}
public void setBuyer(Buyer buyer) {
	this.buyer = buyer;
}
public int getIdCustom() {
	return idCustom;
}
public void setIdCustom(int idCustom) {
	this.idCustom = idCustom;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public List<ChildrensClothing> getChildc() {
	return childc;
}
public void setChildc(List<ChildrensClothing> childc) {
	this.childc = childc;
}
@Override
public String toString() {
	return "Custom [idCustom=" + idCustom + ", date=" + date + ", quantity=" + quantity + ", buyer=" + buyer
			+ ", childc=" + childc + "]";
}
}
