package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student; //import위치 주의 (student 클래스가 이전에 만든게 또 있어서...ㅎ)

public class Run {

	public static void main(String[] args) {
		
		Student student1 = new Student(3,2,"최새정",168.3,'여');
		//int grade, int classroom, String name, double height, char gender
		
		student1.information();

	}

}