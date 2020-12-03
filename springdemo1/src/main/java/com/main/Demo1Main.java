package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class Demo1Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		Student student = (Student) applicationContext.getBean("obj");
		student.setFirstName("gowthami");
		student.setLastName("akula");
		System.out.println("student firstName: "+student.getFirstName());
		System.out.println("student lastName: "+student.getLastName());
		System.out.println("The End");
		

	}

}
