package codeswithpankaj.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloWord
 */
public class HelloWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1: set the content type
		
		response.setContentType("text/html");
		
		// Step 2: get the printwriter
	    
		PrintWriter out = response.getWriter();
		
		// Step 3: generate HTML content
		out.println("<html><body>");
				
		out.println("<h2>Hello World</h2>");
		
		out.println("<hr>");
		
		out.println("Time on the server is: " + new java.util.Date());
				
		out.println("</body></html>");
		
		
	}

	

}
