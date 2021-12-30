package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentGateWay
 */
@WebServlet("/PaymentGateWay")
public class PaymentGateWay extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String customername = request.getParameter("customername");
		int contactno = Integer.parseInt( request.getParameter("contactno"));
		String email = request.getParameter("email");
		String Address = request.getParameter("Address");
		
		
		
		HttpSession session=request.getSession(false);  
        int seat=(int) session.getAttribute("seat"); 
        int Price=(int)session.getAttribute("Price"); 
        int Schedule_id=(int)session.getAttribute("schedule");
        int Seat_Availble=(int)session.getAttribute("Seat_Availble");
        int total_price =Price*seat;
        int seat_reserve =Seat_Availble-seat;
        
        
        
	     PrintWriter out=response.getWriter();
	     out.println("Name "+customername+"Contact NO."+contactno+"Mail"+email+"Adddress"
	     +Address+"Your booked setas"+seat+"Total price"+total_price+"Seat avaialbe"+Seat_Availble);
	    
	 	try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root");  
			  	
			PreparedStatement stmt1=con.prepareStatement("update schedule set seat=? where sch_id=?;");  
			stmt1.setInt(1, seat_reserve);
			stmt1.setInt(2, Schedule_id);
			int rs=stmt1.executeUpdate();
			out.println(rs+" Your Seat has been Successfully Booked!!");  
			
			PreparedStatement stmt=con.prepareStatement("insert into airline_booked(schedule_id, customer_name , contact_no, email , seat_booked,paid  ) values(?,?,?,?,?,?);");
			stmt.setInt(1, Schedule_id);
			stmt.setString(2, customername);
			stmt.setInt(3, contactno);
			stmt.setString(4, email);
			stmt.setInt(5, seat);
			stmt.setInt(6, total_price);
			
			int i=stmt.executeUpdate();
		out.println(i+" We have received Payment Thanks for payment ");  
					
					con.close();  
		}catch(Exception e){ out.println(e);}
	     
	   
	     
	}

}
