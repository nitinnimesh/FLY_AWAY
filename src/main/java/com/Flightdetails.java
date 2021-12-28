package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Flightdetails
 */
@WebServlet("/Flightdetails")
public class Flightdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Flightdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Source=request.getParameter("Source_Address");
		String Desti=request.getParameter("Destination_Address");
		int passengers= Integer.parseInt(request.getParameter("numberofpassenger"));
		String date=request.getParameter("date");
		PrintWriter out=response.getWriter();

	}

}
