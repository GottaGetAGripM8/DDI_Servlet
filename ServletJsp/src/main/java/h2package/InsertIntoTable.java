package h2package;

public class InsertIntoTable {
	
	private static H2Query h2query = new H2Query();
	
    public static void insertTableAlumnos(String nom, String cur, int eda) {
        
    	String sql = "REPLACE INTO Alumnos (nombre, curso, edad) VALUES ('" + nom + "', '" + cur + "', " + eda + ")";
    	
    	h2query.doSqlQuery(sql);
    	
    } 
    
} 