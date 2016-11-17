package h2package;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectFromTable {
	
	private static H2Query h2query = new H2Query();
	
	public static void SelectTableAlumnos() {
		try {
			String sql = "SELECT * FROM Alumnos";
		
			h2query.doSqlQuery(sql);	
		
			H2Connection.conn = DriverManager.getConnection(H2Connection.getDbUrl(), H2Connection.getUser(), H2Connection.getPass());
			H2Connection.stmt = H2Connection.conn.createStatement();
		
			ResultSet rs4 = H2Connection.stmt.executeQuery(sql);
	
			    while (rs4.next()) {
			        rs4.getString(1);
			        rs4.getString(2);
			 
			    }
			} catch (SQLException se) {
                se.printStackTrace();
			} finally {
				try {
	                if (H2Connection.stmt!=null)
	                	H2Connection.conn.close();
	            } catch (SQLException se) {
	            } //do nothing
	            try {
	                if (H2Connection.conn!= null)
	                	H2Connection.conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
			}
	}
	
	

}
