package com.ct.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String pass = req.getParameter("password");
		
		RequestDispatcher rd = null;
		if("admin".equals(username) && "admin".equals(pass)) {
			HttpSession session = req.getSession(true);
			session.setAttribute("username", username);
			session.setAttribute("password", pass);
			rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Either Username or Password is incorrect");
			rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}
		
	}


}
