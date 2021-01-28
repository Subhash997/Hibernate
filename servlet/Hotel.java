package com.hotel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hotel
 */
@WebServlet("/Hotel")
public class Hotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
    public Hotel() {
        super();
       
    }

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Login");
		String Name=request.getParameter("Name");
		String EmailID=request.getParameter("emailID");
		
		if((Name.equals("Subbu"))&&(EmailID.equals("subbu@abc"))) {
			
		HttpSession session=request.getSession();
		session.setAttribute("Name", "emailID");
		session.setMaxInactiveInterval(20);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("HotelDAOimpl");
		dispatcher.forward(request, response);
		}
	}

}
