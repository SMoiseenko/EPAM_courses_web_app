package by.moiseenko.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//set this class as Java Configuration
@Configuration
//allowed to use Spring MVC
@EnableWebMvc
//path, where find project component, such as (   )
@ComponentScan(basePackages = { "by.moiseenko.controller", "by.moiseenko.service", "by.moiseenko.dao",
	"by.moiseenko.mapper" })

public class WebMvcConfig extends WebMvcConfigurerAdapter {

    // path to HTML recourses
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/static_res/**").addResourceLocations("/static_res/");
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
	dataSource.setUrl("jdbc:mysql://localhost:3306/periodicalsDB");
	dataSource.setUsername("user");
	dataSource.setPassword("12345678");
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	return dataSource;
    }

}