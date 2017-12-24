package com.sample;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		ServletContext application = getServletContext();

		// String userName = request.getParameter("userName");
		// String passWord = request.getParameter("passWord");
		//
		// System.out.println();
		// System.out.println("From SecondController..... Starts");
		// System.out.println("userName == " + userName);
		// System.out.println("passWord == " + passWord);
		// System.out.println("From SecondController..... Ends");

		
		HttpSession session = request.getSession();
		
		String emailAddress = (String) session.getAttribute("emailAddress");
		
//		String emailAddress = (String) request.getAttribute("emailAddress");
		System.out.println("From SecondController....." + emailAddress);

//		request.removeAttribute("emailAddress");
//
//		emailAddress = (String) request.getAttribute("emailAddress");
//		System.out.println("From SecondController after Remove....." + emailAddress);
//
//		String mobileNo = (String) application.getAttribute("mobileNo");
//		System.out.println("From SecondController....." + mobileNo);
		
		
		session.removeAttribute("emailAddress");
		session.invalidate();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
