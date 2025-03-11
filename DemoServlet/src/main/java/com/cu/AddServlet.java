package com.cu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
//		res.sendRedirect("sq?k="+k);
		res.sendRedirect("sq");
//		If we don't send the value of k here the the second Servlet would 
//		get an error while trying to fetch the value of k
//		and would redirect us to
//		http://localhost:8081/DemoServlet/sq
//		either in the browser we can add ?k=9 at the end 
//		so the url becomes http://localhost:8081/DemoServlet/sq?k=9 -> SecondServlet would run

		
		

		
	}
}
