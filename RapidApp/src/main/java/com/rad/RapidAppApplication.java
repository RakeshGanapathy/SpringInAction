package com.rad;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class RapidAppApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(RapidAppApplication.class, args);
		
		Student stud = context.getBean(Student.class);
		Student stud2 = context.getBean(Student.class);
		Student stud3 = context.getBean(Student.class);
		log.info("Server application started ");
		stud.setStudName("rakesh");
		stud.setStudDepartment("IT");
		stud.setStudId(1);
		stud2.setStudName("raghu");
		stud2.setStudDepartment("IT");
		stud2.setStudId(11);
		stud3.setStudName("roshan");
		stud3.setStudDepartment("IT");
		stud3.setStudId(10);
		log.info(stud.toString());
		stud.display();
		log.info(stud2.toString());
		log.info(stud3.toString());
		log.debug("debug me");
	}

}
