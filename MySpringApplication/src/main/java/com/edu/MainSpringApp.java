package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {

	public static void main(String[] args) {

		//load the spring.xml file
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld sob= (HelloWorld) context.getBean("HelloWorldob");
		sob.display();
	}

}
