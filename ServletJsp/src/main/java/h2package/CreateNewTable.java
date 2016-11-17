package h2package;

public class CreateNewTable { 
	
	private static H2Query h2query = new H2Query();
	
	public static void createTableAlumnos() {
		
		String sql = "CREATE TABLE IF NOT EXISTS Alumnos " +
					 " (nombre VARCHAR(255), " +
				     " curso VARCHAR(255), " +
				     " edad INTEGER, PRIMARY KEY(nombre))";

		h2query.doSqlQuery(sql);
		
	} 
	
} 