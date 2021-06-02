package com.github.yogeshkharad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceB implements Service {
	
	@Autowired
	@Qualifier("helloWorldJavaBean")
	//Above two annotation are alternative to @Resource
	JavaConfigHelloWorld helloWorld;
	
	public String getInfo() {
		return "ServiceB's Info";
	}
}
