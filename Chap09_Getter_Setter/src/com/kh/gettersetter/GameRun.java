package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		
		// �÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("��ī���ƽ�");
		player1.setHp(205);
		player1.setAttackPower(300);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("������"); //���ݹ��� ĳ����
		player2.setHp(225);
		player2.setAttackPower(280);
		
		
		player2.displayInfo();
		
		System.out.println("���� ��");
		
		player1.attack(player2);
		//player.attack(player1);
	}

}