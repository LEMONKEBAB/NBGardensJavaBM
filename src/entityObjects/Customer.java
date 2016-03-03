package entityObjects;

public class Customer {
	private int customerID;
	private String fullName;
	private String dateOfBirth;
	private String Status;
	
	public Customer() {}
	
	public Customer(int customerID, String fullName, String dateOfBirth,
			String status) {
		this.customerID = customerID;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		Status = status;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getFullName() {
		return fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getStatus() {
		return Status;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setStatus(String status) {
		Status = status;
	}
}