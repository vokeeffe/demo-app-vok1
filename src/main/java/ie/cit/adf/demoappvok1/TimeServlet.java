package ie.cit.adf.demoappvok1;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@SuppressWarnings("serial")
public class TimeServlet extends HttpServlet {

private TimeService timeService;
	
@Override
	public void init() throws ServletException {
		ServletContext servletContext = getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		//Get the TimeService bean from the Application Context
		timeService = ctx.getBean(TimeService.class);

	}
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	PrintWriter writer = resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("Current Time: " + timeService.getCurrentDate());
	writer.println("</body>");
	writer.println("</html>");
	writer.close();
	//super.doGet(req, resp);
}
}
