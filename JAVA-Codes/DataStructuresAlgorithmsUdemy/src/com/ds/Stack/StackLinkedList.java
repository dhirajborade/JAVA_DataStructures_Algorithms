package com.ds.Stack;

import com.ds.LinkedList.SingleLinkedListNode;

public class StackLinkedList<T> {
	SingleLinkedListNode stackTop;

	public StackLinkedList() {
		this.stackTop = null;
	}

	public void pushItem(Object item) {
		SingleLinkedListNode newNode = new SingleLinkedListNode(item, null);
		if (this.stackTop != null) {
			newNode.setNext(this.stackTop);
		}
		this.stackTop = newNode;
	}

	@SuppressWarnings("unchecked")
	public T popItem() {
		if (this.stackTop == null) {
			System.out.println("Stack is Empty");
			return null;
		} else {
			T value = (T) this.stackTop.getValue();
			this.stackTop = this.stackTop.getNext();
			return value;
		}
	}
}
