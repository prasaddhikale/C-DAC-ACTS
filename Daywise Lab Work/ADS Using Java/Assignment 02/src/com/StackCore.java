package com;

public class StackCore {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public StackCore(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		if (top == maxSize - 1) {
			System.out.println("Stack is full. Cannot push " + value);
		} else {
			stackArray[++top] = value;
			System.out.println("Pushed " + value + " onto the stack.");
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is empty. Cannot pop.");
		} else {
			int value = stackArray[top--];
			System.out.println("Popped " + value + " from the stack.");
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty.");
		} else {
			System.out.println("Stack elements are:");
			for (int i = top; i >= 0; i--) {
				System.out.println(stackArray[i]);
			}
		}
	}

	public int size() {
		return top + 1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
