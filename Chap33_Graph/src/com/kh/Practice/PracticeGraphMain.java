package com.kh.Practice;

public class PracticeGraphMain {

	public static void main(String[] args) {
		
		// �׷��� ��� ���� num 10���� ����������
		int num = 7;
		PracticeGraph graph = new PracticeGraph(num);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		graph.addEdge(3, 4);
		graph.addEdge(5, 7);
		
		System.out.println("DFS Ž�� ��� : ");
		graph.DFS(3); // ����� ����
		
		//���������� �� �ö󰡼� ��µ��� ����..
		
	}

}