package com;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		int price = Integer.parseInt(request.getParameter("price"));
		int flight_id=Integer.parseInt(request.getParameter("flight_no"));
		String flight=request.getParameter("flight_no");
		String date=request.getParameter("date");
		int seat=0;
		PrintWriter out=response.getWriter();	
		out.print(Source+Desti+price+flight+date);
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root");  
			  	
			PreparedStatement stmt1=con.prepareStatement("select capacity from flights where flight_id=?;");  
			stmt1.setString(1,flight);
			ResultSet rs=stmt1.executeQuery();  
			if(rs.next()) { 
				 seat=Integer.parseInt((rs.getString(1)));}	
			
			PreparedStatement stmt=con.prepareStatement("insert into schedule(flight_id,destination,source,date,seat,price) values(?,?,?,?,?,?);");
			stmt.setInt(1, flight_id);
			stmt.setString(2, Desti);
			stmt.setString(3, Source);
			stmt.setString(4, date);
			stmt.setInt(5, seat);
			stmt.setInt(6, price);
			
			int i=stmt.executeUpdate();
		out.println(i+" records inserted");  
					
					con.close();  
		}catch(Exception e){ out.println(e);}
		
	

}
}

	
