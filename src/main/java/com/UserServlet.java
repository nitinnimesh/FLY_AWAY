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
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);  
        int seat=(int) session.getAttribute("seat"); 
        int Price=(int)session.getAttribute("Price"); 
        int Seat_Availble=(int)session.getAttribute("Seat_Availble");
        int Schedule=Integer.parseInt(request.getParameter("schedule"));
        HttpSession Session=request.getSession(); 
		Session.setAttribute("schedule", Schedule);
        PrintWriter out =response.getWriter();
        
        int total_price =Price*seat;
        out.println("<html><body>"
        		+ "<form method='post'action ='PaymentGateWay'>"
        		+ "<label> Name</label><input type ='text' name ='customername'></br>"
        		+ "<label>Contact No. </label><input type ='text' name ='contactno'></br>"
        		+ "<label>Email_ID </label><input type ='text' name ='email'></br>"
        		+ "<label>Address </label><input type ='text' name ='Address'></br>"        		
        			+"Total booked seats "+seat+"</br>"
        		+ " Total prices in rupees "+total_price+"\t"+Seat_Availble+"\t"+Schedule+"\t</br>"
        		+ "  </br><input type ='submit' value ='Click here to paytment'></input></form>"
        		+ "</body></html>");
        
	
	}

}
