package com.sample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		this
		
//		String userName = request.getParameter("userName");
//		String passWord = request.getParameter("passWord");
//
//		System.out.println("From FirstController..... Starts");
//		System.out.println("userName == " + userName);
//		System.out.println("passWord == " + passWord);
//		System.out.println("From FirstController..... Ends");
		String emailAddress = "abc@localhost.com";
		
//		ServletContext application = getServletContext();
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30);
		session.setAttribute("emailAddress", emailAddress);
		
//		request.setAttribute("emailAddress", emailAddress);
		
//		String mobileNo = "1234567890";
//		application.setAttribute("mobileNo", mobileNo);
//		
//		response.sendRedirect("SecondController");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("SecondController");
		dispatcher.forward(request, response);
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
