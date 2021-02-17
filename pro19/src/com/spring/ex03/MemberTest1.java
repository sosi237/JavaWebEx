package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberTest1 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("member.xml"));	//member.xml 을 읽어들여 빈을 생성
		MemberService service = (MemberService)factory.getBean("memberService");	//아이디가 memberService 인 빈을 가져옴
		service.listMembers();
	}
}
