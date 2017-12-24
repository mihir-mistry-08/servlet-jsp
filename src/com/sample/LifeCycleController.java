package com.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleController extends HttpServlet {

	public LifeCycleController() {
		System.out.println("LifeCycleController() called !!!!!!!!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init() called !!!!!!!!");
		// int a = 10;
		// int b = 0;
		// int c = a / b;
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() called !!!!!!!!");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost() called !!!!!!!!");
	}

	// @Override
	// protected void service(HttpServletRequest request, HttpServletResponse
	// response)
	// throws ServletException, IOException {
	// System.out.println("service() called !!!!!!!!");
	// }

	@Override
	public void destroy() {
		System.out.println("*****************************");
		System.out.println("	destroy() called !!!!!!!!");
		System.out.println("*****************************");
	}

}
