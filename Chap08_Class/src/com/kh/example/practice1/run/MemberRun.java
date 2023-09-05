package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class MemberRun {
	
	/**
	 실행용 메소드로 기본 생성자를 통해 Member type의 객체를 생성하고 changeName()를 이용해 값 변경 후 printName()를 이용해 출력
	 **/

	public static void main(String[] args) {
		
		// 1. Member의 객체 생성
		
		Member member = new Member(''); //만약에 char값을 넣고싶으면..
		
		// 2. changeName()을 이용한 값 변경
		
		member.changeName("뉴네임");
		
		// 3. printName()를 이용한 출력

	}

}
