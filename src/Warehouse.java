import java.util.Scanner;


public class Warehouse {
	String url = "jdbc:oracle:thin:@192.168.1.42:1521/xe";
	private Query query = new Query();
	
	public void menu() {
		// boolean run = true;		
		Scanner input = new Scanner(System.in);
		String p_m = null;
		
		System.out.println("Press 1 to update stock levels or press 2 to find an items location, press 3 to exit.");
		int task = input.nextInt();
		
		if (task == 1) {
			System.out.println("Press 1 to increase stock, 2 to decrease");
			int pm = input.nextInt();

		if (pm == 1) {
				p_m = "+";
			} else if (pm == 2) {
				p_m = "-";
			} else {
				System.out.println("Invalid option");
			}
		
			System.out.println("Enter product ID for product quantity you wish to update");
			int prod = input.nextInt();
			System.out.println("Enter amount to increase/derease stock by");
			int change = input.nextInt();
			
			query.updateProduct(url, "SYSTEM", "1234", p_m, prod, change);
		}
		input.close();
	}
}
