package servletpackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2package.InsertIntoTable;
import h2package.CreateNewTable;
import utilpackage.AgeCalculator;


public class Servlet extends HttpServlet{
	
	private String nom, cur;
	private int eda;
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Getting data 
		nom = RecoverData.fromUser(req, resp);
		cur = RecoverData.fromCourse(req, resp);
		eda = AgeCalculator.toAge(RecoverData.fromDate(req, resp));
		
		//Set values from datos.jsp in fin.jsp 
		req.setAttribute("nombreS", nom);
		req.setAttribute("edadS", eda);
		req.setAttribute("cursoS", cur);
		
		//Create table 
		CreateNewTable.createTableAlumnos(); 
		
		//Insert into table 
		InsertIntoTable.insertTableAlumnos(nom, cur, eda); 
		
		req.getRequestDispatcher("fin.jsp").forward(req, resp);
		  
		super.doPost(req, resp);
		
		redirect(resp);	 
		
	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
	}
	 
	private void redirect(HttpServletResponse resp) throws IOException, ServletException {
		resp.sendRedirect("fin.jsp");
	}
	
}
