package com.github.yogeshkharad;

public class ClientA implements Client {
	
	Service service;
	
	public ClientA() {		
	}
	
	public ClientA(Service service) {
		this.service = service;
	}
	
	public void init() {
		System.out.println("Init called in ClientA");
	}

	public void print() {
		
		String info = service.getInfo();
		System.out.println(info);
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void destroy() {
		System.out.println("destroy called in ClientA");
	}
}
