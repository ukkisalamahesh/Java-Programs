package com.spring2priject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
//	this example setter onjection
	
ClassPathXmlApplicationContext cts = new ClassPathXmlApplicationContext("config2.xml");
 Stydent bean = (Stydent) cts.getBean("st");
 System.out.println(bean);
 Stydent bean1= (Stydent) cts.getBean("st2");
 System.out.println(bean1);
}
}

