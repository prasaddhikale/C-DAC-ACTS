package com;

public class SinglyCircularLinkedList{
	static class Node{
		private Node next;
		private int data;
		
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}	
	}
	private Node head;
	
	public SinglyCircularLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	public void display() {
		if(isEmpty())
			return;
		 Node trav = head;
		 System.out.println("SinglyCircularLinkedList :");
		 do {
			 System.out.println(trav.data);
			 trav = trav.next;
		 }while(trav!=head);
		 System.out.println();
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			head.next = head;
		}else {
			
			Node trav = head;
			while(trav.next!=head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			head.next = head;
		}else {
		
			Node trav = head;
			while(trav.next!=head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
		}
	}
	
	
	
	public void delLast() {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		if(head.next==head) {
			head = null;
		}else {
			Node trav = head;
			Node temp = null;
			while(trav.next!=head) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = head;
		}
	}
	
	public int count() {
		if (isEmpty()) {
			return 0;
		}
		int cnt = 0;
		Node trav = head;
		do {
			++cnt;
			trav=trav.next;
		} while ((trav!= head));
		return cnt;
	}
	
}

