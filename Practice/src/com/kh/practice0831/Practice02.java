package com.kh.practice0831;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		/*
		 위 1번 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("자연수 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		//조건 값 만들기 boolean 변수 = true or false;
		
		while(num>1) { //2. 조건 추가하기
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
			} else { // 1이상인 숫자들(자연수)
				for(int i = 1 ; i<=num ; i++) {
				System.out.print(i + " /");
					}
				//3. 조건 false 만들기
			}	
		}

	}

}
