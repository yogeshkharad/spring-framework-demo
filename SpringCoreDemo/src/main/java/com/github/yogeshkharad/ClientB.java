package com.github.yogeshkharad;

public class ClientB implements Client {
	
	Service service;
	
	public ClientB(){
		
	}
	
	public ClientB(Service service) {
		this.service = service;
	}

	public void print() {
		
		String info = service.getInfo();
		System.out.println(info);
	}
	
	public void setService(Service service) {
		this.service = service;
	}
}
