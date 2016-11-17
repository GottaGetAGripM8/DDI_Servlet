package servletpackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecoverData extends HttpServlet{
	
	public static String fromUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return req.getParameter("user").toString();
	} 
	
	public static String fromCourse(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return req.getParameter("curso").toString();
	}
	
	public static int fromDate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int year = Integer.parseInt(req.getParameter("edad").toString().substring(0, 4));
		//Recupera el dato de la fecha, lo pasa a string, corta el año y lo convierte en numero entero
				
		return year;
	}  
	
} 