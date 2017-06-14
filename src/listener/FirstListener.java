package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements javax.servlet.ServletContextListener  {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String initParam = sce.getServletContext().getInitParameter("initParam");
		System.out.println("contextInitialized : initParam="+initParam);
	}

	
}
