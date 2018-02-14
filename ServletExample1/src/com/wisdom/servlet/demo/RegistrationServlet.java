package com.wisdom.servlet.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("--firstName-->" + firstName);
		System.out.println("--lastName-->" + lastName);
		System.out.println("--email-->" + email);
		System.out.println("--userName-->" + userName);
		System.out.println("--password-->" + password);
		String fullName = firstName + " " + lastName;
		request.setAttribute("full_name", fullName);
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("jsp/success.jsp");
		requestDispatcher.forward(request, response);
	}

}
