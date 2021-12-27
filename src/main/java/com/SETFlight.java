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
		String date=request.getParameter("date");
		
		
		PrintWriter out=response.getWriter();	
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root");  
			PreparedStatement stmt=con.prepareStatement("select date from flights where password=? && ;");  
			stmt.setString(1,Pass);
			ResultSet rs=stmt.executeQuery();  
			if(rs.next()) { 
				String username=rs.getString(1);
				if(username.equals(User)) {
				out.println("Welcome "+rs.getString(1));
				RequestDispatcher rd=request.getRequestDispatcher("/FlightSchedule.jsp");  
		        rd.forward(request, response);  
				
				} 
				else {
					out.println("Username is not available \t NO LOGGED IN");
				}
			}
			
			con.close();  
			}catch(Exception e){ out.println(e);}
	}

}
