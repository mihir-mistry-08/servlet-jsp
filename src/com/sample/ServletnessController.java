package com.sample;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletnessController extends HttpServlet {

	private String adminEmailAddress;
	private String adminContactNo;

	@Override
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		ServletContext application = getServletContext();
		// config.getServletContext();
		System.out.println(config.getServletName());
		adminEmailAddress = config.getInitParameter("adminEmailAddress");
		System.out.println(adminEmailAddress);

		adminContactNo = application.getInitParameter("adminContactNo");
		System.out.println(adminContactNo);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost() called...");
		// TODO : Code to send email ......
		// ServletConfig config = getServletConfig();
		ServletContext application = getServletContext();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
