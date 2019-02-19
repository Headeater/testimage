

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;
import java.io.File;

/**
 * Servlet implementation class startservlet
 */
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public startservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Hello Servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
        out.println("<body>");
        out.println("<html>");
        out.println("<title>JSP File upload</title>"); 
        

        File[] files = new File("C:\\Users\\Sebi\\Ablage\\").listFiles();. 

        for (File file : files) {
            if (file.isFile()) {
                out.println(file.getName() + "<br>");
            }
        }
        
        out.println("<br>");
		out.println("</body>");
        out.println("</html>");
		
		doGet(request, response);
	}

}
