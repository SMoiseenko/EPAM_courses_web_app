/*package by.moiseenko.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
	AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
	appContext.register(WebMvcConfig.class);
	appContext.refresh();
	
	servletContext.addListener(new ContextLoaderListener(appContext));

	// Dispatcher Servlet
	DispatcherServlet servlet = new DispatcherServlet(appContext);
	ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",
		servlet);
	registration.setLoadOnStartup(1);
	registration.addMapping("/");
	registration.setInitParameter("contextClass", appContext.getClass().getName());
    }
}*/