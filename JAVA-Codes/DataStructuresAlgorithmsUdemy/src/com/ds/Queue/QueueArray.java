package com.ds.Queue;

public class QueueArray<T> {
	
	Object[] QueueArray;
	int rear, front, size;

	public QueueArray(int size) {
		this.size = size;
		this.QueueArray = new Object[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isFull() {
		return (this.rear == this.size - 1);
	}
	
	public boolean isEmpty() {
		return (this.front == -1 || this.front > this.rear);
	}
	
	public void Queue(Object newItem) {
		if (this.isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		this.rear++;
		this.QueueArray[this.rear] = newItem;
		if (this.front == -1) {
			this.front = 0;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T DeQueue() {
		if (this.isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		T outputObject = (T) this.QueueArray[this.front];
		this.front++;
		return outputObject;
	}
}
