package com.kh.threadPractice;

public class GameMain extends GameLoop { //GameLoop ���

	public static void main(String[] args) {
		
		// ���� ���� �����带 �����ϴ� ��
		Thread gameThread = new Thread(new GameLoop()); // gameThread��� �ν��Ͻ� ����
		gameThread.start(); //GameLoop�����带 �����ς����
	
		// ������ ���� ���� ���� (Enter�� �Է��ϸ� isGameOver�� true�� ��)
		try {
			System.in.read();
			isGameOver = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// trycatch���� GameLoop�� ������ �ȵǴ� ������ ���� ������ ���� �³�?
		
	}

}