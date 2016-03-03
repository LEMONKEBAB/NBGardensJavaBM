package entityObjects;

public class ProductM {
	private int productID;
	private String description;
	
	public ProductM(){}
	
	public ProductM(int productID, String description) {
		this.productID = productID;
		this.description = description;
		
		
	}

	public int getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
