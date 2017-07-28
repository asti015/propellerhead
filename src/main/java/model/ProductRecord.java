package model;

/**
 * Bean object for an product record.
 * 
 * @author ana.stilinovic
 */
public class ProductRecord {

	private int id;

	private String productNumber;

	private String description;

	private double itemPrice;

	public ProductRecord(int id, String productNumber, String decription, double itemPrice) {
		this.id = id;
		this.productNumber = productNumber;
		this.description = description;
		this.itemPrice = itemPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Product {" +
				"id=" + id +
				", productNumber='" + productNumber + '\'' +
				", description='" + description + '\'' +
				", itemPrice=" + itemPrice +
				'}';
	}
	
}
