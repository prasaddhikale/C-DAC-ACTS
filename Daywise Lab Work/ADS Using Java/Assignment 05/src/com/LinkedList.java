package com;

public class LinkedList {
	Node head;

	static class Node {
		private Node next;
		private int data;

		public Node(int data) { // node constructor
			this.data = data;
			next = null;
		}

	}

	void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode; // init. head to newNode's ref if no node is present before
		} else {
			Node curNode = head;
			while (curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = newNode; // add newNode's ref. to the next pointer of the last node
		}

	}

	public void display() {
		if (isEmpty()) {
			System.out.println("LinkedList is Empty");
			return;
		}
		Node curNode = head;

		System.out.println("LinkedList elements : ");
		while (curNode.next != null) {
			System.out.println(curNode.data);
			curNode = curNode.next;
		}
		System.out.println(curNode.data);

	}

	public int count() throws Exception {

		Node curNode = head;
		int count = 0;
		if (isEmpty()) {
			System.out.println(count);
			throw new Exception("No element present");
		}

		while (curNode.next != null) {
			curNode = curNode.next;
			++count;
		}
		return ++count;

	}

	public boolean isEmpty() {

		if (head == null) {
			return true;
		}
		return false;
	}

}
