package com.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("attributeAdded().......");
		System.out.println(event.getName());
		System.out.println(event.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("attributeRemoved().......");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("attributeReplaced().......");
	}

}
