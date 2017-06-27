package com.ds.LinkedList;

public class SingleLinkedListNode {
	private Object value;
	private SingleLinkedListNode next;
	
	public SingleLinkedListNode(Object value, SingleLinkedListNode next) {
		this.setValue(value);
		this.setNext(next);
	}
	
	public void setNext(SingleLinkedListNode next) {
		this.next = next;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public SingleLinkedListNode getNext() {
		return next;
	}
}
