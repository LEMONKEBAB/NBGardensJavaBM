package entityObjects;

public class Address {
	
	private String line1;
	private String town;
	private String county;
	private String postcode;
	
	public Address() {}
	
	public Address(String line1, String town, String county, String postcode) {
		this.line1 = line1;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
	}

	public String getLine1() {
		return line1;
	}

	public String getTown() {
		return town;
	}

	public String getCounty() {
		return county;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	
	
}
