package com.github.yogeshkharad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class HelloWorldConfig {
	
	@Value("${app.name}")
	String appName;
	
   @Bean 
   public JavaConfigHelloWorld helloWorldJavaBean(){
	   System.out.println("App Name: "+ this.appName);
      return new JavaConfigHelloWorld();
   }
}