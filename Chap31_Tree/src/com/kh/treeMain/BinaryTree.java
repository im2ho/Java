package com.kh.treeMain;
/*
 ��带 �����ϰ� ���ư���(��ȸ) ����ϴ� ����Ʈ��
 	���� ��ȸ : root(�Ѹ�)�� ���� ���� �湮
 	���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
 	���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
 	���� ��ȸ : �� �� node�� ���� �Ʒ� �������� ���ʴ�� �湮
 */
public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	/*
	 
	 insert, insertRec �޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	 
	 insert : �ܺο� ����Ǵ� �޼���
	 insertRec : ���� ���� �۾� �޼���
	 	
	 */
	
	public void insert(int data) { // insert �޼���
		
		root = insertRec(root, data);
		
	}
	
	private TreeNode insertRec(TreeNode root, int data) {
		
		// intsertRec �޼���
		// ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
		// ����� : �ڱ� �ڽ��� �����ϰ�, �ٽ� �ڱ� �ڽ��� ����ؼ� ���ǳ���
		
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		if(data<root.data) { //���� ���� �����Ͱ� root���� ������ ��������
			root.left = insertRec(root.left, data);
		} else if(data>root.data) { // ũ�� ����������
			root.right = insertRec(root.right, data);
		}
		
		return root;
		
	}
	
	/*
	 
	 inOrderT : ������ȸ
	 inOrderTR : ������ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 ���� ����Ʈ�� > ������ > ������ ����Ʈ�� ������ ��� ���
	 
	 */
	
	public void inOrderT() { // inOrderTraversal : ������ȸ
		// �ܺο� ����Ǵ� �޼���
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
		if(root != null) {
			inOrderTR(root.left);
			System.out.println(root.data + " ");
			inOrderTR(root.right);
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); //�ν��Ͻ� ����
		
		tree.insert(50);
		tree.insert(70);
		tree.insert(30);
		tree.insert(40);
		tree.insert(20);
		tree.insert(80);
		tree.insert(60);
		
		
		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT();
	}

}