package com.ds.LinkedList;

public class SingleLinkedList<T> {
	
	SingleLinkedListNode head;

	public SingleLinkedList() {
		this.head = null;
	}
	
	public void insertNode(Object value) {
		SingleLinkedListNode newNode = new SingleLinkedListNode(value, null);
		if (this.head != null) {
			newNode.next = head;
		} 
		head = newNode;
	}
	
	public void deleteNode() {
		this.head = this.head.next;
	}

	@SuppressWarnings("unchecked")
	public void displayList() {
		SingleLinkedListNode tempNode = head;
		while(tempNode != null) {
			System.out.println((T) tempNode.value);
			tempNode = tempNode.next;
		}
	}
}
