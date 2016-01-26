package ua.lviv.lg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@NamedQueries({
	@NamedQuery(name="Buyer.findBuyerByCity", query="select b from Buyer b where b.city like :city"),
})
public class Buyer {
	@Id
	@GeneratedValue
private int idBuyer;
	@Column
private String firstName; 
private String lastName;
private int telefonNumber;
private String city;
private String email;
private String password;
@OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.LAZY, mappedBy="buyer")
private List<Custom> custom;

public Buyer(){
	}
public Buyer(String firstName, String lastName, int telefonNumber, String city, String email,String password) {
	super();
		this.firstName = firstName;
	this.lastName = lastName;
	this.telefonNumber = telefonNumber;
	this.city = city;
	this.email = email;
	this.password=password;
}
public String getFirstName() {
	return firstName;
}

public int getIdBuyer() {
	return idBuyer;
}

public void setIdBuyer(int idBuyer) {
	this.idBuyer = idBuyer;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getTelefonNumber() {
	return telefonNumber;
}

public String getPassword() {
	return password;

}
public void setTelefonNumber(int telefonNumber) {
	this.telefonNumber = telefonNumber;
}

public List<Custom> getCustom() {
	return custom;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setCustom(List<Custom> custom) {
	this.custom = custom;
}
@Override
public String toString() {
	return "Buyer [idBuyer=" + idBuyer + ", firstName=" + firstName + ", lastName=" + lastName + ", telefonNumber="
			+ telefonNumber + ", city=" + city + ", email=" + email + ", password=" + password + ", custom=" + custom
			+ "]";
}

}








