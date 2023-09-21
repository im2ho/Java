package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPracticeTest {

	ArrayPractice ap = new ArrayPractice(5);
	ArrayPractice ap1 = new ArrayPractice();
	
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPractice2() {
		String expected = "oiiaiooiiiaio";
		String actual = "oiiaiooioiaio";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testPractice3() {
		int[] arr = {1,2,3};
		assertEquals(arr, ap.practice12());
	}
	
	@Test
	public void testPractice4() {
		String[] fruits = {"»ç°ú","±Ö","Æ÷µµ","º¹¼þ¾Æ","Âü¿Ü"};
		assertEquals(fruits, ap1.practice4());
	}
}