package com.demo;

import java.util.Arrays;
import java.util.List;

public class Student {
	
	
	private int id;
	
	private String name;
	
	private String address;
	
	private String[]subjects;
	
	private List<Integer> marks;
	
	
	
	public void display() {
		
		System.out.println("ID      = "+id);
		System.out.println("Name    = "+name);
		System.out.println("Address = "+address);
		System.out.println("Subject = "+Arrays.toString(subjects));
		marks.forEach(i->System.out.print("Marks = "+i+", "));
		System.out.println("\n=======================");
	}
	
	
	

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}


	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
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
