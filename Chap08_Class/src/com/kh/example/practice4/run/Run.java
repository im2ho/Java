package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student; //import��ġ ���� (student Ŭ������ ������ ����� �� �־...��)

public class Run {

	public static void main(String[] args) {
		
		Student student1 = new Student(3,2,"�ֻ���",168.3,'��');
		//int grade, int classroom, String name, double height, char gender
		
		student1.information();

	}

}