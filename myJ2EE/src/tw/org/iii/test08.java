package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test08")
public class test08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x, y, result;
		try {
			x = Integer.parseInt(request.getParameter("x"));
			y = Integer.parseInt(request.getParameter("y"));
			result = x + y;
		}catch(Exception e) {
			x = y = result = 0;
		}
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter()
		.append("<form>")
		.append("<input type='text' name='x' value='"+ x +"'>")
		.append("+")
		.append("<input type='text' name='y' value='"+ y +"'>")
		.append("<input type='submit' value='='>")
		.append("<span>" + result + "</span>")
		.append("</form>");
		
	}

	
	

}
