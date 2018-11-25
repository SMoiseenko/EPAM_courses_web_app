package by.moiseenko.config;

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
	appContext.register(ApplicationConfig.class);
	servletContext.addListener(new ContextLoaderListener(appContext));

	// Dispatcher Servlet
	ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher",
		new DispatcherServlet(appContext));
	dispatcher.setLoadOnStartup(1);
	dispatcher.addMapping("/");
	dispatcher.setInitParameter("contextClass", appContext.getClass().getName());
    }
}