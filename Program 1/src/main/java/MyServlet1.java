import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws IOException , ServletException{
    	
    }

    public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
    
            PrintWriter out = res.getWriter();
            out.print("<h1>Login Page</h1>");
            String user = req.getParameter("username");
            String pwd =req.getParameter("userpass");
            if(user.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("aayush")) {
            	out.println("<p>Login Successfully</p>");
            }  
          
            else {
            	out.println("<p>Login Failed</p>");
            }
    }
}