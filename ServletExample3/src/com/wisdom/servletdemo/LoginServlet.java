package com.wisdom.servletdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wisdom.dbHandler.DBHandler;
import com.wisdom.pojo.Login;

/**
 * Servlet implementation class LoginServlet
 */
/*@WebServlet("/LoginServlet")*/
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String redirectpath = "";
		boolean success = false;
		try {
			String userName = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("--User Name----->" + userName);
			System.out.println("--Password----->" + password);
			if (userName != null && !userName.equals("") && password != null && !password.equals("")) {
				DBHandler dbHandler = new DBHandler();
				Login login = new Login();
				login.setUserName(userName.trim());
				login.setPassword(password.trim());
				success = dbHandler.loginOperation(login);
				System.out.println("---Success---->" + success);
			}
			if (success) {
				request.setAttribute("username", userName);
				redirectpath = "/jsp/success.jsp";
			} else {
				redirectpath = "/jsp/fail.jsp";
			}
			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(redirectpath);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
