package com.ds.LinkedList;

public class SingleLinkedList<T> {
	
	SingleLinkedListNode head;

	public SingleLinkedList() {
		this.head = null;
	}
	
	public void insertNode(Object value) {
		SingleLinkedListNode newNode = new SingleLinkedListNode(value, null);
		if (this.head != null) {
			newNode.setNext(head);
		} 
		head = newNode;
	}
	
	public void deleteNode() {
		this.head = this.head.getNext();
	}

	@SuppressWarnings("unchecked")
	public void displayList() {
		SingleLinkedListNode tempNode = head;
		while(tempNode != null) {
			System.out.println((T) tempNode.getValue());
			tempNode = tempNode.getNext();
		}
	}
}
