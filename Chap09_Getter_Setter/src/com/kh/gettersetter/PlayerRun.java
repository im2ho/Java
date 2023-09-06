package com.kh.gettersetter;

public class PlayerRun {

	public static void main(String[] args) {
		
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("한카리아스");
		player1.setHp(0); //체력이 없습니다
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