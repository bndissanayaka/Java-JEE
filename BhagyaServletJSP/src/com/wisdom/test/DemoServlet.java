package com.wisdom.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String fwdpage;
		if (username.equals("admin") && password.equals("123")) {
			fwdpage = "/jsp/success.jsp";
		} else
			fwdpage =  "/jsp/fail.jsp";
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(fwdpage);
		requestDispatcher.forward(req, resp);
	}
}
