package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerifyLoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2806761285384270730L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");

		if (isLoggedIn != null && isLoggedIn) {
			String userName = (String) session.getAttribute("userName");
			PrintWriter out = response.getWriter();
			out.println("<h1>Welcome  </h1><h2><b>" + userName + "</b></h2>");
			out.println("<a href=\"LogOutController\">LogOut</a>");
		} else {
			response.sendRedirect("Login.html");
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}