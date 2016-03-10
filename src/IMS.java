


import java.sql.Statement;

import entityObjects.Address;
import entityObjects.Customer;
import entityObjects.Employee;
import entityObjects.Product;
import entityObjects.ProductM;


public class IMS {
	String url = "jdbc:oracle:thin:@192.168.1.42:1521/xe";
	Statement stat = null;
	private Query query = new Query();
	private Login signin = new Login();
	public static void main(String[] args) {
		IMS ims = new IMS();
		ims.logon();
		//System.out.println(role);
		
	}
	public String logon(){
		String role = signin.login("'K.Magnusson'", "'K.Magnusson'", url , "SYSTEM", "1234");
		if (role == null){
			System.out.println("Login Failed");}
		else{
			System.out.println("Login Successful");
			if(role.equals("Sales")){
				System.out.println("Sales access");}
			else if(role.equals("Accounts")){
				System.out.println("Accounts access");}
			else if(role.equals("Warehouse")){
				System.out.println("WH access");}
			else if(role.equals("Inventory Manager")){
				System.out.println("IM access");}}
		return role;
	}
	
	public void mongo() {
		query.readProduct(new ProductM(), "localhost", 27017, "NBmk2");
	}
	public void select(){
		//query.selectEntity(new Customer(), url, "SYSTEM", "1234");
		//query.selectEntity(new Address(), url, "SYSTEM", "1234");
		//query.selectEntity(new Product(), url, "SYSTEM", "1234");
		query.selectEntity(new Employee(), url, "SYSTEM", "1234");
	}
	public void update(){
		query.updateProduct(url, "SYSTEM", "1234", "+", 3, "productID = 1");
	}
}
