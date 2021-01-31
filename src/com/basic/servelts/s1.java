package com.basic.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s1")
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public s1() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		PrintWriter out=response.getWriter();
		out.print("<h1>My name is "+name+"</h1>");
		out.print("<h1>My name is "+email+"</h1>");
		out.print("<a href='s2'/>Go to 2nd Servelts");
		out.print("<br>");
		out.print("<br>");
		
		
		//Add Cookie
		Cookie cookie=new Cookie("user_name", name);
		Cookie cookie1=new Cookie("user_email", email);
		response.addCookie(cookie);
		response.addCookie(cookie1);
		
		
		//Request Dispather
		/*request.setAttribute("name",name );
		 RequestDispatcher rd=request.getRequestDispatcher("s2");
		  rd.forward(request, response);*/
		
	}
	

}
