package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddXY extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		
		int x=0;
		int y=0;
		
		if(!x_.equals("")) {x= Integer.parseInt(x_);}
		if(!y_.equals("")) {x= Integer.parseInt(y_);}
		
		int sum = x + y;
		
		out.println(sum);
		
	}
}
