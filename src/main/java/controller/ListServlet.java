package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Notepad;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Notepad note = new Notepad();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("allUsers", note.chooseAllRecords());
		request.getRequestDispatcher("/listAllUsers.jsp").forward(request, response);
	}

}
