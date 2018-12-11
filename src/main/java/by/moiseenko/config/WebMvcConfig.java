package by.moiseenko.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

@EnableWebMvc

@ComponentScan(basePackages = { "by.moiseenko.controller", "by.moiseenko.service", "by.moiseenko.dao" })
@PropertySource("classpath:database.properties")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    Environment environment;

    private final String URL = "url";
    private final String USER = "dbuser";
    private final String DRIVER = "driver";
    private final String PASSWORD = "dbpassword";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public InternalResourceViewResolver getViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/pages/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
	return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setUrl(environment.getProperty(URL));
	dataSource.setUsername(environment.getProperty(USER));
	dataSource.setPassword(environment.getProperty(PASSWORD));
	dataSource.setDriverClassName(environment.getProperty(DRIVER));
	return dataSource;
    }

}