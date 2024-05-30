package queue;

public class Queue {
	private int front;
	private int rear;
	private int capacity;
	private int[] queue;
	public Queue(int capacity) {
		this.capacity = capacity;
		front=0;
		rear=0;
		queue=new int[capacity];
	}
	
	
	public boolean isEmpty(){

			return front==rear;
	}
	public boolean isFull() {
		
		return rear==capacity;
	}
	
	public void enqueue(int element) {
		if(isFull()) 
			return;
		queue[rear]=element;
		rear++;
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
			
		front++;
	}
	
	public void display(){
		for(int i=front;i<rear;i++) {
			System.out.println(queue[i]);
		}
	}
	
	
}
