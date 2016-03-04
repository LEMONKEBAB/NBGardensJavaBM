package entityObjects;

public class Employee {
	private int employeeID;
	private String employeeName;
	private String employeeRole;
	private String username;
	private String pass;
	
	public Employee(){}
	
	public Employee(int employeeID, String employeeName, String employeeRole, String username, String pass) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.username = username;
		this.pass = pass;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public String getUsername() {
		return username;
	}

	public String getPass() {
		return pass;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
