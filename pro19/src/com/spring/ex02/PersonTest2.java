package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest2 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));	//person.xml 을 읽어들여 빈을 생성
		PersonService person1 = (PersonService)factory.getBean("personService1");	//아이디가 personService1 인 빈을 가져옴
		person1.sayHello();	
		System.out.println();
		
		PersonService person2 = (PersonService)factory.getBean("personService2");	//아이디가 personService2 인 빈을 가져옴
		person2.sayHello();
	}
}
