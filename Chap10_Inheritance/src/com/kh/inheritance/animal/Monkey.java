package com.kh.inheritance.animal;

public class Monkey extends Animal {
	
	public Monkey(String name) {
		
		super(name);
	
	}
	
	@Override //override를 해준다고 명시했음
	public void sleep() {
		System.out.println(getName() + ": 나무에서 자다가 떨어질 수 있음");
	}
}