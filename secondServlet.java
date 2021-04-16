package demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */

public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count = 2;
	ServletConfig config;
	String rol;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondServlet() {
        
    }

	
    public void init(ServletConfig config)
    {
    	
    	try {
			super.init(config);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("Init Methods");
    	config = (ServletConfig)getServletConfig();
		rol = config.getInitParameter("role");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		System.out.println("Service Method");
		//if(rol.equals("admin"))
		
			out.println("<h1> Welcome to second servlet </h1>");
		
		
		out.println();
		out.println("Visitors count : "+count);
		out.close();
	}

}
