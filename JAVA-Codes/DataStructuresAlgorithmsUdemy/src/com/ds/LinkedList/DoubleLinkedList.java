package com.ds.LinkedList;

public class DoubleLinkedList<T> {

	DoubleLinkedListNode head;
	DoubleLinkedListNode tail;

	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertNode(Object value) {
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(value, null, null);
		if (this.head != null) {
			newNode.next = this.head;
			this.head.previous = newNode;
			
		} 
		head = newNode;
		newNode.previous = null;
		if (this.tail == null) {
			this.tail = newNode;
		}
	}
	
	public void deleteNode() {
		this.head = this.head.next;
		this.head.previous = null;
	}

	@SuppressWarnings("unchecked")
	public void displayList() {
		DoubleLinkedListNode tempNode = head;
		while(tempNode != null) {
			System.out.println((T) tempNode.value);
			tempNode = tempNode.next;
		}
	}

}
