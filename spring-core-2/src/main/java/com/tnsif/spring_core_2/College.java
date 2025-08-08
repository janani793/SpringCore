package com.tnsif.spring_core_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class College {
	private Student student;
@Autowired
	public void Collage(Student student) {
		this.student = student;
	}
	public void showCollageDetails() {
		System.out.println("Welcome to college class");
		student.showStudent();
	}
}
