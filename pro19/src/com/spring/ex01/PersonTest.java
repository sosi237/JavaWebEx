package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));	//person.xml 을 읽어들여 빈을 생성
		PersonService person = (PersonService)factory.getBean("personService");	//아이디가 personService 인 빈을 가져옴
		person.sayHello();	//생성된 빈을 이용해 name값 출력
	}
}
