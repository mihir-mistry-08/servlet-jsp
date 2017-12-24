package com.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Date today = new Date();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Royal\'s Login Page</h1>");
		out.println("<br>" + today);
		out.println("</body>");
		out.println("</html>");
	}

}
