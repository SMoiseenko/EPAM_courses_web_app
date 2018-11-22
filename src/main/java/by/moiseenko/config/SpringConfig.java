package by.moiseenko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.moiseenko.dao.TestBean;

@Configuration
public class SpringConfig {

    @Bean
    public TestBean getTestBean() {
	return new TestBean("My name is");
    }

}
