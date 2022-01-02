package com;

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FlyAway
 */
@WebServlet("/FlyAway")
public class FlyAway extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Source=request.getParameter("Source_Address");
		String Desti=request.getParameter("Destination_Address");
		int seat=Integer.parseInt(request.getParameter("numberofpassenger"));
		String date=request.getParameter("date");
		PrintWriter out =response.getWriter();
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root");   	
			PreparedStatement stmt1=con.prepareStatement("select * from schedule where (destination = ? and source=?) and date=?;");  
			stmt1.setString(1, Desti);
			stmt1.setString(2, Source);
			stmt1.setString(3, date);
			ResultSet rs=stmt1.executeQuery();  
			out.println("<html><body> "
					+ "<form action='UserServlet' method='post' >   ");
			
			while(rs.next()) { 
				int available_seat=rs.getInt(6);
				
				if(available_seat>=seat) {
					out.println("</br><input type='radio' name='schedule' value="+rs.getInt(1)+">");	
				out.println(("\tFlights\t"+rs.getInt(2)+" DATE \t"+rs.getString(5)+"\tSEAT Available\t"+rs.getInt(6)+"\tPrice\t"+rs.getInt(7)));
				HttpSession session=request.getSession(); 
				session.setAttribute("seat", seat);
		        session.setAttribute("Price",rs.getInt(7)); 
		        session.setAttribute("Seat_Availble",rs.getInt(6)); 
		  	}
								
				}
	out.println(" </br><input type='submit' value ='CLICK HERE TO BOOK'></form></body></html>");
			con.close();  
		}catch(Exception e){ out.println(e);}
		
	}

}
