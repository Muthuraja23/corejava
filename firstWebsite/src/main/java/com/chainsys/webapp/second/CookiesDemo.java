package com.chainsys.webapp.second;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie [] allCookies = request.getCookies();
		if(allCookies==null) {
		System.out.println("No cookies found");
		return;
		}
		int cookielength = allCookies.length;
		for(int i=0;i<cookielength; i++) {
			System.out.println(allCookies [i].getName()+"-"+allCookies[i].getValue());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie firstCookie = new Cookie("Mentor", "Raj");
		firstCookie.setMaxAge(-1);
		// If value is less than zero cookies will get deleted immediately after the execution.
		// If the value
		response.addCookie(firstCookie);
		Cookie secondCookie = new Cookie("Coach", "Mutha");
		secondCookie.setMaxAge(2*24*60*60);
		response.addCookie(secondCookie);
		Cookie thirdCookie = new Cookie("Captain", "Muthu");
		response.addCookie(thirdCookie);
	}

}
