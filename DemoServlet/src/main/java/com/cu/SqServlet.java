package com.cu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
			
		int k=Integer.parseInt(req.getParameter("k"));
//		here we are trying to get the value of k which has not been sent by firstServlet(addServlet)
		PrintWriter out=res.getWriter();
		out.println("you are on the second servlet and the square is "+k*k);
	}

}
