package com;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SETFlight
 */
@WebServlet("/SETFlight")
public class SETFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SETFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Source=request.getParameter("Source_Address");
		String Desti=request.getParameter("Destination_Address");
		//int date=Integer.parseInt(request.getParameter("date"));
		int price = Integer.parseInt(request.getParameter("price"));
		int flight=Integer.parseInt(request.getParameter("flight_no"));
		
		PrintWriter out=response.getWriter();	
		
		out.print(Source+Desti+price+flight);
		
	}

}
