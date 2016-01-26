package ua.lviv.lg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column
private String productType;
@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "type")
private List<ChildrensClothing> chilclo;

public ProductType(){
	}
public ProductType(String productType) {
	super();
	this.productType = productType;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProductType() {
	return productType;
}

public void setProductType(String productType) {
	this.productType = productType;
}

public List<ChildrensClothing> getChilclo() {
	return chilclo;
}

public void setChilclo(List<ChildrensClothing> chilclo) {
	this.chilclo = chilclo;
}

@Override
public String toString() {
	return "ProductType [id=" + id + ", productType=" + productType + ", chilclo=" + chilclo + "]";
}

}
