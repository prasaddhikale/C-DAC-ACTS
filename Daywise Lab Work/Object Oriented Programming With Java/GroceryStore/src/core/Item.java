package core;

import java.time.LocalDateTime;

public class Item {
	private String name;
	private int pricePerUnit;
	private int quantity;
	private LocalDateTime dateTime;

	public Item(String name, int pricePerUnit, int quantity, LocalDateTime dateTime) {
		super();
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
		this.dateTime = dateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", pricePerUnit=" + pricePerUnit + ", quantity=" + quantity + ", dateTime="
				+ dateTime + "]";
	}

}
