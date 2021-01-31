package com.basic.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/s2")
public class s2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public s2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1>This is servlet 2</h>");
		
		Cookie[] cookies= request.getCookies();
		Cookie[] cookies1=request.getCookies();
		boolean f=false;
		String name="";
		String email="";
		
		if(cookies1==null)
		{
			out.println("<h1>You are new user go to home page");
			return;	
		}
		
		else {
			for(Cookie c1:cookies1)
			{
				String temail=c1.getName();
				if(temail.equals("user_email"))
				{
					f=true;
					email=c1.getValue();
				}
				
			}
		}
		
		if(f)
		{
			out.print("<h1>My email is:"+email+"</h1>");
		}
		else {
			out.print("error");
		}
		
		if(cookies==null)
		{
			out.println("<h1>You are new user go to home page");
			return;
		}
		else {
			for(Cookie c:cookies)
			{
				String tname=c.getName();
				if(tname.equals("user_name"))
				{
					f=true;
					name=c.getValue();
				}
			}
		}
		
		
		
		if(f)
		{
			out.print("<h1>My name is:"+name+"</h1>");
		}
		else {
			out.println("<h1>You are new user go to home page...."+f);
		}
		
	/*	String name=(String)request.getAttribute("name");
		out.print("<h1>My name is</h1>"+name);*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
