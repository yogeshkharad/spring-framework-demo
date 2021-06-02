package com.github.yogeshkharad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext
			= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		Client clientA = (Client) appContext.getBean("clientA");
		clientA.print();
		
		Client clientB = (Client) appContext.getBean("clientB");
		clientB.print();
		
		
		HelloWorld objA = (HelloWorld) appContext.getBean("helloWorld");
	      objA.getMessage1();
	      objA.getMessage2();

	      HelloGrads objB = (HelloGrads) appContext.getBean("helloIndia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	      
	      //Close Context to call destroy methods
	      ((ClassPathXmlApplicationContext)appContext).registerShutdownHook();
		//((ClassPathXmlApplicationContext)appContext).close();
	}

}
