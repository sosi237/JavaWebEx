package com.spring.ex01;

public class PersonServiceImpl implements PersonService{	//setter를 이용한 의존성 주입의 경우
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
