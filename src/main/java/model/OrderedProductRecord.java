package model;

/**
 * Bean object for an ordered product record.
 * 
 * @author ana.stilinovic
 */
public class OrderedProductRecord {

	private int id;

	private int orderRecord;

	private int product;

	private int quantity;

	private double totalPrice;
	
	public OrderedProductRecord(int id, int orderRecord, int product, int quantity, double totalPrice) {
		this.id = id;
		this.orderRecord = orderRecord;
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Product {" +
				"id=" + id +
				", orderRecord='" + orderRecord + '\'' +
				", product='" + product + '\'' +
				", quantity='" + quantity + '\'' +
				", totalPrice=" + totalPrice +
				'}';
	}

}
