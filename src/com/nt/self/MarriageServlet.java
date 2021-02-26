package com.nt.self;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		String gender=req.getParameter("gender");
		
		if(gender.equalsIgnoreCase("M"))
		{
			if(age>21)
				pw.println("<h1>"+name+"You Are Eligible</h1>");
			else
				pw.println("<h1> Mr."+name+"Your age is :"+age+" You Are Not Eligible</h1>");
		}
		else
		{
			if(age>18)
				pw.println("<h1>"+name+"You Are Eligible</h1>");
			else
				pw.println("<h1>"+name+"You Are Not Eligble</h1>");
		}
		pw.println("<h1><a href='http://localhost:8085/MarriageApp/input.html'>Home</a></h1>");
		pw.close();
	}

}
