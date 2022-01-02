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
        out.println("<html><style>\r\n"
        		+ "input[type=text], select {\r\n"
        		+ "  width: 100%;\r\n"
        		+ "  padding: 12px 20px;\r\n"
        		+ "  margin: 8px 0;\r\n"
        		+ "  display: inline-block;\r\n"
        		+ "  border: 1px solid #ccc;\r\n"
        		+ "  border-radius: 4px;\r\n"
        		+ "  box-sizing: border-box;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "input[type=submit] {\r\n"
        		+ "  width: 100%;\r\n"
        		+ "  background-color: #f2c200;\r\n"
        		+ "  color: white;\r\n"
        		+ "  padding: 14px 20px;\r\n"
        		+ "  margin: 8px 0;\r\n"
        		+ "  border: none;\r\n"
        		+ "  border-radius: 4px;\r\n"
        		+ "  cursor: pointer;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "input[type=submit]:hover {\r\n"
        		+ "  background-color: #f2c200;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "div {\r\n"
        		+ "  border-radius: 5px;\r\n"
        		+ "  background-color: #f2f2f2;\r\n"
        		+ "  padding: 20px;\r\n"
        		+ "}\r\n"
        		+ "</style><body>"
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
