package by.moiseenko.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration

public class ApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class<?>[] { WebMvcConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
	return new Class<?>[] { WebMvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
	return new String[] {"/"};
    }
}