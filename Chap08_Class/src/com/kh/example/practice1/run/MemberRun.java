package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class MemberRun {
	
	/**
	 ����� �޼ҵ�� �⺻ �����ڸ� ���� Member type�� ��ü�� �����ϰ� changeName()�� �̿��� �� ���� �� printName()�� �̿��� ���
	 **/

	public static void main(String[] args) {
		
		// 1. Member�� ��ü ����
		
		Member member = new Member(''); //���࿡ char���� �ְ������..
		
		// 2. changeName()�� �̿��� �� ����
		
		member.changeName("������");
		
		// 3. printName()�� �̿��� ���

	}

}
