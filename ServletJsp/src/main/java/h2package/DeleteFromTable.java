package h2package;

public class DeleteFromTable {
	
	private static H2Query h2query = new H2Query();
	 
	public static void deleteTableAlumnos(String nom) {
    	
    	String sql = "DELETE FROM Alumnos WHERE nombre='" + nom + "'";
    	
		h2query.doSqlQuery(sql);

    } 
    
} 