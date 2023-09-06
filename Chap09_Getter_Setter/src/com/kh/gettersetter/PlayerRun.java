package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("한카리아스");
		player1.setHp(205);
		player1.setAttackPower(300);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("망나뇽"); //공격받은 캐릭터
		player2.setHp(225);
		player2.setAttackPower(280);
		
		
		player2.displayInfo();
		
		System.out.println("공격 후");
		
		player1.attack(player2);
		//player.attack(player1);
	}

}