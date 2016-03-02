import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteResult;


public class Query {
	private Connect connect = new Connect();
	
	/**
	 * Selects all entries from the table corresponding to the passed in entity
	 * 
	 * @param entity - this is an entity from the ERD
	 * @param url
	 * @param user
	 * @param pass
	 * @return
	 */
	public <E> ResultSet selectEntity(E entity, String url, String user, String pass) {
		ResultSet rs = null;
		Connection conn = null;
		Statement stat = null;
			try {
				conn = connect.getConn(url, user, pass);
				//System.out.println("Connected");
				stat = conn.createStatement(
						ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
			 rs = stat.executeQuery("SELECT * FROM " + 
					entity.getClass().getName().toLowerCase().substring(
					entity.getClass().getName().lastIndexOf('.') + 1) +" e");
			 ResultSetMetaData rsmd = rs.getMetaData();
			 int columnCount = rsmd.getColumnCount();
			 String[] columnNames = new String[columnCount];
			 for (int i = 1; i <= columnCount; i++ ) {
				  String name = rsmd.getColumnName(i);
				  columnNames[i-1] = name;
				}
			 String print = "";
			 try{
				 while(rs.next()){
					 for(int i = 0; i<= columnCount -1; i++){
						 print = print + rs.getString(columnNames[i])+", ";				
					 }
					 print = print + "\n";
				 }
				 System.out.println(print);
				 
			 } catch (SQLException e) {
				 e.printStackTrace();
	}
			 
			 
			} catch (SQLException se) {
				se.printStackTrace();
			} finally {
				connect.closeConn(stat, conn);
				//System.out.println("Disconnected");
			}
			return rs;
		}
	
	/*public <E> void addEntity(E e, String host, int port, String dbn, String user, char[] pass) {
			 MongoClient client = new MongoClient(new ServerAddress(host, port), getcreds(dbn, user, pass));
			 @SuppressWarnings("deprecation")
			DB db = client.getDB(dbn);
			 DBCollection col = db.getCollection(
			e.getClass().getName(). substring(e.getClass().
			getName().lastIndexOf('.') + 1));
			 try {
			 WriteResult r = col.insert((DBObject[]) e);
			 System.out.println(r.getUpsertedId());
			 System.out.println(r.getN());
			 System.out.println(r.isUpdateOfExisting());
			 } catch(ClassCastException cce) {
			 cce.printStackTrace();
			 } finally {
			 client.close();
			 }
			}*/
}
