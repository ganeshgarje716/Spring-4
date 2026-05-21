package com.demo;

public class Student {
	
	
	private int id;
	
	private String name;
	
	private String address;
	
	
	
	public void display() {
		
		System.out.println("ID      = "+id);
		System.out.println("Name    = "+name);
		System.out.println("Address = "+address);
		System.out.println("=======================");
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
