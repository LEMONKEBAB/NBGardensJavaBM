


import java.sql.Statement;
import java.util.Scanner;

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
	private Warehouse warehouse = new Warehouse();
	
	public static void main(String[] args) {
		IMS ims = new IMS();
		String role = ims.logon();
		ims.menus(role);
		
		
	}
	
	public void menus(String role){
		
			if (role.equals("Warehouse")){
				System.out.println("banana");
				warehouse.menu();
			}	
		
	}
	
	public String logon(){
		Scanner user_input = new Scanner( System.in );
		String username = "'";
		String password ="'";
		System.out.println("Enter your username");
		username = username + user_input.next() + "'";
		//System.out.println(username);
		System.out.println("Enter your password");
		password = password + user_input.next() + "'";
		//System.out.println(password);
		//user_input.close();
		
		String role = signin.login(username, password, url , "SYSTEM", "1234");
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
		query.updateProduct(url, "SYSTEM", "1234", "+", 3, 1);
	}
}
