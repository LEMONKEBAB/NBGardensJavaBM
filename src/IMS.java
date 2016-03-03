


import java.sql.Statement;

import entityObjects.Address;
import entityObjects.Customer;
import entityObjects.Product;
import entityObjects.ProductM;


public class IMS {
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	Statement stat = null;
	private Query query = new Query();
	char[] Chararr = {1, 2, 3, 4};
	public static void main(String[] args) {
		IMS ims = new IMS();
		ims.update();
		
	}
	
	public void mongo() {
		query.readProduct(new ProductM(), "localhost", 27017, "NBmk2");
	}
	public void select(){
		query.selectEntity(new Customer(), url, "SYSTEM", "1234");
		query.selectEntity(new Address(), url, "SYSTEM", "1234");
		query.selectEntity(new Product(), url, "SYSTEM", "1234");
	}
	public void update(){
		query.updateProduct(url, "SYSTEM", "1234", "-", 3, "productID = 1");
	}
}
