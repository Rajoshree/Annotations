package com.annotations.mypackage;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	public void work() {
		System.out.println("Teacher teaches");
	}
}
