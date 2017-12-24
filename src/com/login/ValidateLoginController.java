package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateLoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2806761285384270730L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");

		if ("admin".equals(userName) && "admin".equals(passWord)) {
			HttpSession session = request.getSession();
			session.setAttribute("isLoggedIn", Boolean.TRUE);
			session.setAttribute("userName", userName);
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
