package servletpackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2package.DeleteFromTable;


public class ServletBorrar extends HttpServlet{
	
	private String nom;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Getting data
		nom = req.getParameter("nomB");
		
		//Delete from table 
		DeleteFromTable.deleteTableAlumnos(nom);
		
		redirect(resp);
		
		super.doPost(req, resp);
 
	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
				
		req.setAttribute("nom", user);
		
		DeleteFromTable.deleteTableAlumnos(user); 
		
		redirect(resp);
		
		
		redirect(resp);
		super.doPost(req, resp);
	}

	private void redirect(HttpServletResponse resp) throws IOException, ServletException {
		resp.sendRedirect("EndForm.jsp");
	}
	
}
