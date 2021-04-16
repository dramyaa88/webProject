package demo.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class thirdServlet
 */

public class thirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Connection conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config)
    {
    	try {
			super.init(config);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	config = (ServletConfig)getServletConfig();
    	
    	Enumeration<String> names = config.getInitParameterNames();
    	
    	while(names.hasMoreElements())
    	{
    		String classname = names.nextElement();
    		String cn = config.getInitParameter(classname);
    		
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
