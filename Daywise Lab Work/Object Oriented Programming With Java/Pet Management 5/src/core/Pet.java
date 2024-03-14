package core;

public class Pet {
	private static int nextId=101;
	private int petId;
	private String name;
	private Category category;
	private double uPrice;
	private int stock;
	
	public Pet(String name, Category category, double uPrice, int stock) {
		super();
		this.petId=nextId++;
		this.name = name;
		this.category = category;
		this.uPrice = uPrice;
		this.stock = stock;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Pet.nextId = nextId;
	}

	public int getPetId() {
		return this.petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getuPrice() {
		return uPrice;
	}

	public void setuPrice(double uPrice) {
		this.uPrice = uPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", Unit Price=" + uPrice + ", stock="
				+ stock + "]";
	}

	public static Pet get(int petId2) {
		// TODO Auto-generated method stub
		return null;
	}



}
