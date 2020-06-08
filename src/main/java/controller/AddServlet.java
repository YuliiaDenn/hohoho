package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.Notepad;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Notepad note = new Notepad();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/addUser.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setSurname(request.getParameter("surname"));
		user.setName(request.getParameter("name"));
		user.setSecondName(request.getParameter("secondName"));
		user.setPhoneNumber(request.getParameter("phoneNumber"));
		note.addRecord(user);

		request.setAttribute("newUser", user);
		request.getRequestDispatcher("/added.jsp").forward(request, response);
	}

}
