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

@SuppressWarnings("serial")
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reDirectPath = "";
		boolean result = false;
		DBConnectionHandler conHandl = new DBConnectionHandler();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String studId = request.getParameter("sId");
		String age = request.getParameter("age");
		String dob = request.getParameter("dob");
		String telNo = request.getParameter("telno");
		String address = request.getParameter("addrs");
		String nicNo = request.getParameter("nic");
		String country = request.getParameter("cntry");
		String city = request.getParameter("city");
		String other = request.getParameter("other");

		User reguUser = new User();

		reguUser.setFname(fname);
		reguUser.setLname(lname);
		reguUser.setStudId(studId);
		reguUser.setAge(age);
		reguUser.setDob(dob);
		reguUser.setTelNo(telNo);
		reguUser.setAddress(address);
		reguUser.setNicNo(nicNo);
		reguUser.setCountry(country);
		reguUser.setCity(city);
		reguUser.setOther(other);

		result = conHandl.dbHandlerRegister(reguUser);
		if (result) {
			reDirectPath = "/jsp/regSuccess.jsp";
		} else
			reDirectPath = "/jsp/regFail.jsp";
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(reDirectPath);
		requestDispatcher.forward(request, response);
	}

}
