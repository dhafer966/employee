package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmployeeManagementWebappApplication extends SpringBootServletInitializer{
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementWebappApplication.class, args);
	}

}
