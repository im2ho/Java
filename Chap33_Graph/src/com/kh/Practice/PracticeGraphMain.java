package com.kh.Practice;

public class PracticeGraphMain {

	public static void main(String[] args) {
		
		// 그래프 노드 개수 num 10개로 정의햇음요
		int num = 7;
		PracticeGraph graph = new PracticeGraph(num);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		graph.addEdge(3, 4);
		graph.addEdge(5, 7);
		
		System.out.println("DFS 탐색 결과 : ");
		graph.DFS(3); // 출발점 지정
		
		//시작점보다 더 올라가서 출력되지 않음..
		
	}

}