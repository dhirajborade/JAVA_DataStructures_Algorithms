package com.ds.Queue;

import java.util.Arrays;

public class QueueDynamicArray<T> {
	
	Object[] QueueDynamicArray;
	int rear, front, size;

	public QueueDynamicArray(int size) {
		this.size = size;
		this.QueueDynamicArray = new Object[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty() {
		return (this.front == -1 || this.front > this.rear);
	}
	
	public int getSize() {
		return this.QueueDynamicArray.length;
	}
	
	public void checkCapacity(int requiredCapacity) {
		int currentCapacity = this.getSize();
		if (requiredCapacity > currentCapacity) {
			int newCapacity = currentCapacity * 2;
			if (newCapacity < requiredCapacity) {
				newCapacity = requiredCapacity;
			}
			this.QueueDynamicArray = Arrays.copyOf(QueueDynamicArray, newCapacity);
		}
	}
	
	public void Queue(Object newItem) {
		this.checkCapacity(this.rear + 2);
		this.rear++;
		this.QueueDynamicArray[this.rear] = newItem;
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
		T outputObject = (T) this.QueueDynamicArray[this.front];
		this.front++;
		return outputObject;
	}
}
