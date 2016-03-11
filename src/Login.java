import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Login {
	private Connect connect = new Connect();
	
	public String login(String username, String password, String url, String user, String pass){
			
		ResultSet rs = null;
		Connection conn = null;
		Statement stat = null;
		String role = null;
		try {
			conn = connect.getConn(url, user, pass);
			//System.out.println("Connected");
			stat = conn.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			rs = stat.executeQuery("SELECT employeerole FROM EMPLOYEE WHERE username =" + username + " AND pass = " + password );
			if (rs.next()){
				role = rs.getString("EMPLOYEEROLE");
				//System.out.println(role);
				}
			}catch (SQLException se) {
				se.printStackTrace();
				
			} finally {
				connect.closeConn(stat, conn);
				//System.out.println("Disconnected");	
			}
		return role;		
		}
}
