package ua.lviv.lg.entity;
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
@Entity
@NamedQueries({
	@NamedQuery(name="ChildrensClothing.findPrice", query="select cl from ChildrensClothing cl where cl.price like :price"),
	@NamedQuery(name="ChildrensClothing.availability", query="select cl from ChildrensClothing cl where cl.availability like :availability"),
		})
public class ChildrensClothing {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column
private float price;
private String availability;
@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
private List<Custom> custom;
@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
private ProductType type;
public ChildrensClothing(){
	}
public ChildrensClothing(float price, String availability) {
	super();
	this.price = price;
	this.availability = availability;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getAvailability() {
	return availability;
}
public void setAvailability(String availability) {
	this.availability = availability;
}
public List<Custom> getCustom() {
	return custom;
}
public void setCustom(List<Custom> custom) {
	this.custom = custom;
}
public ProductType getType() {
	return type;
}
public void setType(ProductType type) {
	this.type = type;
}
@Override
public String toString() {
	return "ChildrensClothing [id=" + id + ", price=" + price + ", availability=" + availability + ", custom=" + custom
			+ ", type=" + type + "]";
}
}
