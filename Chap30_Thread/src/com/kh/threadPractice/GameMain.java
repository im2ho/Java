package com.kh.threadPractice;

public class GameMain extends GameLoop { //GameLoop 상속

	public static void main(String[] args) {
		
		// 게임 루프 스레드를 시작하는 곳
		Thread gameThread = new Thread(new GameLoop()); // gameThread라는 인스턴스 생성
		gameThread.start(); //GameLoop스레드를 실행하궛어요
	
		// 게임의 종료 조건 설정 (Enter를 입력하면 isGameOver가 true가 됨)
		try {
			System.in.read();
			isGameOver = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// trycatch문을 GameLoop에 넣으면 안되는 이유가 내가 생각한 것이 맞나?
		
	}

}