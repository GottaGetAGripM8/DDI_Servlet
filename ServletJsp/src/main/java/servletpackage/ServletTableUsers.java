package servletpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilpackage.ListUsers;
import utilpackage.User;

/**
 * Servlet implementation class Servlet3
 */
public class ServletTableUsers extends HttpServlet {
	List<User> listAllUsers = new ArrayList<User>();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listAllUsers = ListUsers.listAllUsers();
		req.setAttribute("listAllUsers", listAllUsers);
		redirect(req,resp);
		
		super.doPost(req, resp);
	}

	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tablaUsers.jsp");
		dispatcher.forward(req,resp);
		//resp.sendRedirect("borrar.jsp");
	}
}
