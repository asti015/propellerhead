package model;

/**
 * Bean object for an order product.
 * 
 * @author ana.stilinovic
 */
public class OrderRecord {

	private int id;

	private String orderNumber;

	private String orderStatus;

	private String creationTime;

	private int customerRecordId;

	private String customerName;

	public OrderRecord(int id, String orderNumber, String orderStatus, String creationTime, int customerRecordId, String customerName) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		this.creationTime = creationTime;
		this.customerRecordId = customerRecordId;
		this.customerName = customerName;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public int getCustomerRecordId() {
		return customerRecordId;
	}

	public void setCustomerRecordId(int customerRecordId) {
		this.customerRecordId = customerRecordId;
	}


	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName= customerName;
	}
	
	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderNumber='" + orderNumber + '\'' +
				", orderStatus='" + orderStatus + '\'' +
				", creationTime=" + creationTime +
				'}';
	}
}
