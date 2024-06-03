package com;

public class BST {

	public Node root;

	public static class Node {

		private Node right;
		private Node left;
		private int value;

		public Node(int value) {

			this.value = value;
			left = null;
			right = null;
		}

	}//Node

	public void insert(int value) {
		Node newNode = new Node(value);
		if (root == null)
			root = newNode;
		else
			insert(root, newNode);
	}

	private void insert(Node node, Node newNode ) {
		
		if(newNode.value<node.value) {
			if(node.left==null)
				node.left = newNode;
			else
				insert(node.left,newNode);
		}//if
		else {
			if(node.right==null)
				node.right = newNode;
			else
				insert(node.right,newNode);
		}//esle
		
	}//insert
	
	public void inOrder() {
		inOrder(root);
	}//inOrder

	private void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);		
	}//inOrder
	public void preOrder() {
		preOrder(root);
	}//preOrder

	private void preOrder(Node node) {
		if(node==null)
			return;
		
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);		
	}//preOrder
	
	public void postOrder() {
		postOrder(root);
	}//postOrder

	private void postOrder(Node node) {
		if(node==null)
			return;
		
		
		postOrder(node.left);
		postOrder(node.right);		
		System.out.println(node.value);
	}//postOrder

	
	
}//bst