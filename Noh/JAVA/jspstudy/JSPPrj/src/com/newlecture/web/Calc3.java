package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		ServletContext application = request.getServletContext();
		
		int v=0;
		
		if(!v_.equals("")) {v= Integer.parseInt(v_);}
				
		//���
		if(op.equals("=")) {
			
			int x = (Integer)application.getAttribute("value");
			int y = v;
			String operator = (String)application.getAttribute("op");;
			int result=0;
			
			if(operator.equals("+"))
				result = x+y;
			else
				result = x-y;
			
			response.getWriter().printf("result is %d\n", result);
		
		//���� ����	
		}else {
			//���ø����̼� �����
			//���ø����̼ǿ� 2���� ����
			application.setAttribute("value", v);
			application.setAttribute("op", op);
		}
			
		
	}
}
