package core;

public class Order {
	private static int nextId=1;
	private int orderId;
	private int petId;
	private int quantity;
	private Status status;
	public Order( int petId, int quantity) {
		super();
		this.orderId = nextId++;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Order.nextId = nextId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

}
