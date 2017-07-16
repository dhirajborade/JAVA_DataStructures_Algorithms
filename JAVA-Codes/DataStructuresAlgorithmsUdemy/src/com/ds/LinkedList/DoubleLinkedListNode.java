package com.ds.LinkedList;

public class DoubleLinkedListNode {
	public Object value;
	public DoubleLinkedListNode next;
	public DoubleLinkedListNode previous;
	
	public DoubleLinkedListNode(Object value, DoubleLinkedListNode next, DoubleLinkedListNode previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
}
