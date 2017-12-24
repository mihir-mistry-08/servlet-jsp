package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("*****************************");
		System.out.println("contextInitialized()........");
		System.out.println("*****************************");

		ServletContext application = event.getServletContext();
		// Create your Java Object and do set attribute
		application.setAttribute("test", "abc");
		application.setAttribute("test", "abc");
		application.removeAttribute("test");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("*****************************");
		System.out.println("contextDestroyed()........");
		System.out.println("*****************************");
	}

}
