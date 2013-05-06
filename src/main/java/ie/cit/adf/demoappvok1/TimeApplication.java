package ie.cit.adf.demoappvok1;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimeApplication {
	public static void main(String[] args) {
		
		System.out.println("Time Application");
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:context-config.xml");

		ClassPathXmlApplicationContext ctx = null;
		try {
			
			ctx = new ClassPathXmlApplicationContext("classpath:context-config.xml");

			TimeService serviceImpl = ctx.getBean(TimeService.class);
			
			Date currentDate = serviceImpl.getCurrentDate();
			
			System.out.println(currentDate);
			
		} finally {
		    if (ctx != null)
		        ctx.close();
		}
	}
}
