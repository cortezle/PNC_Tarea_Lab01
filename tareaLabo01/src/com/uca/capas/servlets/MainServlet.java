package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String username = request.getParameter("username").toString();
		String password = request.getParameter("password").toString();
		
		PrintWriter out = response.getWriter();
		
		if(username.equals("admin") && password.equals("admin")) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>"+ "Correcto: " + username + " " + password +"</h3>");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>"+ "Incorrecto"+ "</h3>");
			out.print("</body>");
			out.print("</html>");
		}
		
		
		
	}

}
