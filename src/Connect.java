import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import oracle.jdbc.pool.OracleDataSource;


public class Connect {
	
	public Connection getConn (String url, String user, String pass) {
			 
		Connection conn = null;
			
		try {
			
			OracleDataSource ds = new OracleDataSource();
			ds.setURL(url);
			conn = ds.getConnection(user, pass);
			} catch (SQLException e) {
			 
				e.printStackTrace();
				}
		return conn;
		}
	
	public void closeConn(Statement stat, Connection conn) {
		if (stat != null)
			try {
				stat.close();
			 } catch (SQLException e) {
				 e.printStackTrace();
			 }
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*public DB getConnM(String host, int port){
			MongoClient client = new MongoClient(host,port);
			@SuppressWarnings("deprecation")
			DB db = client.getDB("NB_Gardens");
			System.out.println("Connected");
			client.close();
			System.out.println("Disconnected");
			return db;
	}*/
	/*public List<MongoCredential> getcreds(String db, String user, char[] pass) {
		List<MongoCredential> creds = new ArrayList<MongoCredential>();
			 creds.add(MongoCredential.createPlainCredential(user, db, pass));
			 return creds;
			}*/

	
}
