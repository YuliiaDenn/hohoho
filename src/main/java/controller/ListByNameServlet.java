package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Notepad;

/**
 * Servlet implementation class listByNameServlet
 */
public class ListByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Notepad note = new Notepad();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/listUsersByName.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		request.setAttribute("listByName", note.chooseRecordsByName(name));
		request.getRequestDispatcher("/listByNameResult.jsp").forward(request, response);

	}

}
