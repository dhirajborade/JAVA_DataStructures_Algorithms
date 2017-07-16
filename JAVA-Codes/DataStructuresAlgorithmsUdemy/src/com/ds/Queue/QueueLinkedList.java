package com.ds.Queue;

import com.ds.LinkedList.DoubleLinkedListNode;

public class QueueLinkedList<T> {

	DoubleLinkedListNode front;
	DoubleLinkedListNode rear;

	public QueueLinkedList() {
		this.front = null;
		this.rear = null;
	}

	public void queue(Object value) {
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(value, null, null);
		if (this.rear == null) {
			this.front = newNode;
			this.rear = newNode;
		} else {
			newNode.next = null;
			newNode.previous = this.rear;
			this.rear.next = newNode;
			this.rear = newNode;
		}
	}

	@SuppressWarnings("unchecked")
	public T deQueue() {
		if (this.rear == null || this.front == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		T returnValue = (T) this.front.value;
		this.front = this.front.next;
		if (this.front != null) {
			this.front.previous = null;
		}
		return returnValue;
	}
}
