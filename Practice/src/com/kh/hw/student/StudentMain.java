package com.kh.hw.student;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentModel m = new StudentModel();
		StudentView v = new StudentView();
		StudentController c = new StudentController(m,v);
		
		c.runStudent();
		v.displayInfo();
		
	}
}
