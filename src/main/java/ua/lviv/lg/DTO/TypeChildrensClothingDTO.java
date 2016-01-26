package ua.lviv.lg.DTO;

public class TypeChildrensClothingDTO {
	private int id;
	private float price;
	private String availability;
	private String productType;

	public TypeChildrensClothingDTO(float price, String availability, String productType) {
		super();
			this.price = price;
		this.availability = availability;
		this.productType = productType;
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

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
}
