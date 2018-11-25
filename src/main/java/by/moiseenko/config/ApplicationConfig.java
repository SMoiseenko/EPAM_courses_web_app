package by.moiseenko.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "by.moiseenko.controller", "by.moiseenko.service", "by.moiseenko.dao",
	"by.moiseenko.mapper" })
public class ApplicationConfig {

    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/pages/");
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
	dataSource.setUrl("jdbc:mysql://localhost:3306/periodicalsDB?useSll=false");
	dataSource.setUsername("user");
	dataSource.setPassword("12345678");
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	return dataSource;
    }
}