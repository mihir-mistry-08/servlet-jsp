package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String[] subjects = request.getParameterValues("subjects");

		out.println("<b>userName == </b>" + userName+"<br>");
		out.println("<b>passWord == </b>" + passWord+"<br>");

		StringBuilder selectedSubject = new StringBuilder();
		for (String subject : subjects) {
			selectedSubject.append(subject).append(",");
		}
		out.println("selectedSubject == " + selectedSubject+"<br>");

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}