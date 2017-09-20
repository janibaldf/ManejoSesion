package controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private final String userID = "anibal";
	//private final String password = "anibal";

        @Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// get request parameters for userID and password
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		  ConexionLDAP con= new ConexionLDAP();
        //con.getAauthentication("diazf.jorge@clarogt", "SEPTO*2017");
                // System.out.println(con.getAauthentication("diazf.jorge", "SEPTO*2017"));
                boolean login=con.getAauthentication(user, pwd);
		if(login){
			Cookie loginCookie = new Cookie("user",user);
			//setting cookie to expiry in 30 mins
			loginCookie.setMaxAge(30*60);
			response.addCookie(loginCookie);
			response.sendRedirect("main.jsp");
		}else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
			PrintWriter out= response.getWriter();
			out.println("<div class=\"alert alert-danger alert-dismissable\">\n" +
"  <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n" +
"  <strong>Error</strong> Ingreso no autorizado.\n" +
"</div>");
                  
                       //response.sendRedirect("main.jsp");

			rd.include(request, response);
		}

	}

}