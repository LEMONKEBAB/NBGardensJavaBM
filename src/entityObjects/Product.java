package entityObjects;

public class Product {
	private int productID;
	private String name;
	private int quantity;
	private int price;
	private int dicontinued;
	
	public Product(){}
	
	public Product(int productID, String name, int quantity, int price, int dicontinued) {
		this.productID = productID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.dicontinued = dicontinued;
	}

	public int getProductID() {
		return productID;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public int isDicontinued() {
		return dicontinued;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDicontinued(int dicontinued) {
		this.dicontinued = dicontinued;
	}
	
	
	
	
}
