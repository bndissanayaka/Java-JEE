package com.wisdom.servletdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wisdom.db.DBConnectionHandler;
import com.wisdom.pojo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirectpath = "";
		String username = request.getParameter("uname");
		String password = request.getParameter("pword");
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		DBConnectionHandler dbhndlr = new DBConnectionHandler();
		boolean result = dbhndlr.dbHandlerLogin(user);
		
		if (result) {
			request.setAttribute("uname", username);		
			redirectpath = "/jsp/registration.jsp";
		}else
			redirectpath = "/jsp/loginFail.jsp";
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(redirectpath);
		requestDispatcher.forward(request, response);
	}

	
}
