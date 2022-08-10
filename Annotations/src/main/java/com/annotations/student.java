package com.annotations;

import org.springframework.stereotype.Component;

@Component
public class student {
	
	String string;
	
	
	public student() {
		super();
	}

	public student(String string) {
		// TODO Auto-generated constructor stub
		this.string =string;
	}

	public void studying() {
		System.out.println(this.string+"is studying");
	}
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void playing() {
		
		System.out.println("I am playing");
	}

	
	
}
