package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Slogin;
import com.model.SloginAdmin;

/**
 * Servlet implementation class SloginDelete
 */
public class SloginDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SloginAdmin sa = new SloginAdmin();
	Slogin s = new Slogin();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		s.setUsername(request.getParameter("username"));		
		try {
			if (sa.deleteSlogin(s)) {
	            response.sendRedirect("sucess.jsp");
	         } else {
	             response.sendRedirect("error.jsp");
	         }
					}
			catch(Exception e)
			{
				
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
