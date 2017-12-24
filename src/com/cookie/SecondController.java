package com.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			String isLoggedIn = null;
			for (Cookie aCookie : cookies) {
				if ("isLoggedIn".equals(aCookie.getName())) {
					isLoggedIn = aCookie.getValue();
					break;
				}
			}

			if ("true".equals(isLoggedIn)) {
				// Welcome user
			} else {
				// Goto Login page
			}
			
			Cookie aCookie = new Cookie("isLoggedIn", null);
			aCookie.setMaxAge(0);
			response.addCookie(aCookie);
			
			
		} else {
			System.out.println("No Cookies Found");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
