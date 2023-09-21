package com.kh.testBA.before;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
	
	private Calculator cal;
	
	@Before
	public void setUp() {
		// �� �׽�Ʈ �޼��� ���� ���� ������ �۾� ����
		cal = new Calculator();
		System.out.println("�׽�Ʈ ����!");
	}
	
	@After
	public void tearDown() {
		// �� �׽�Ʈ �޼��� ���� �� ������ �۾��� ����
		System.out.println("�׽�Ʈ ����");
	}
	
	@Test
	public void testAddition() {
		int result = cal.add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testSub() {
		int result = cal.subtract(10, 5);
		assertEquals(5, result);
	}
}
