package com.g.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.g.entity.GameValue;


@WebServlet("/guess-number")
public class Game extends HttpServlet {
	GameValue ran = new GameValue();
	GameValue max = new GameValue(5);
	GameValue min = new GameValue(0);
	GameValue hit = new GameValue(1);
	String text = "";
	int random = ran.setRandom(max.getValue());
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int gNum_ = Integer.parseInt(request.getParameter("gNum"));
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String url = "/reEnter.jsp";
		
		hit.increase();
		
		if(gNum_ == random) {
			text="���߼̽��ϴ�.";
			out.println(text);
		}else if(gNum_ < random && gNum_ > min.getValue()) {
			text = "���ڸ� �� ����������.";
			setAttri(request, response, url);
		}else if(gNum_ > random && gNum_ < max.getValue()) {
			text="���ڸ� �� ���纸����.";
			setAttri(request, response, url);
		}else {
			text=min.getValue()+"��"+max.getValue()+"������ ���� �־��ּ���.";
			setAttri(request, response, url);
		}
	}

	private void setAttri(HttpServletRequest request, HttpServletResponse response, String url)
			throws ServletException, IOException {
		request.setAttribute("text", text);
		request.setAttribute("hit", hit.getValue());
		request.getRequestDispatcher(url).forward(request, response);
	}

}