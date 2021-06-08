package com.github.yogeshkharad;

public class FactoryMethodBeanExample {
	
	public static final  FactoryMethodBeanExample factoryMethodBeanExample = new FactoryMethodBeanExample();
	
	private FactoryMethodBeanExample() {
		System.out.println("FactoryMethodBeanExample created");
	}
	public static FactoryMethodBeanExample getBeanThroughFactoryMethod() {
		return factoryMethodBeanExample;
	}

}
