package com;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		
	      HttpSession session=request.getSession(false);  
	        int seat=(int) session.getAttribute("seat"); 
	        int Price=(int)session.getAttribute("Price"); 
	        int Seat_Availble=(int)session.getAttribute("Seat_Availble");
	        String schedule =request.getParameter("schedule");
	        
	        PrintWriter out =response.getWriter();
	        out.println(seat+"\t"+Price+"\t"+Seat_Availble+"\t"+schedule+"\t"+"HELLO");
	        
	        out.println("");
	        
	        
	}

}
