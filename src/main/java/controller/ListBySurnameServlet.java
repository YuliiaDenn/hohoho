package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Notepad;

/**
 * Servlet implementation class listBySurnameServlet
 */
public class ListBySurnameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Notepad note = new Notepad();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/listUsersBySurname.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String surname = request.getParameter("surname");
		request.setAttribute("listBySurname", note.chooseRecordsBySurname(surname));
		request.getRequestDispatcher("/listBySurnameResult.jsp").forward(request, response);
	}

}
