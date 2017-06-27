package com.ds.Stack;

public class StackArray<T> {
	Object[] stackArray;
	int size;
	int stackTop;

	public StackArray(int size) {
		this.size = size;
		this.stackArray = new Object[this.size];
		this.stackTop = -1;
	}
	
	private boolean isFull() {
		return (this.stackTop == this.size - 1);
	}
	
	private boolean isEmpty() {
		return (this.stackTop == -1);
	}
	
	public void pushItem(Object item) {
		if (this.isFull()) {
			System.out.println("Stack is Full");
		} else {
			this.stackTop++;
			this.stackArray[this.stackTop] = item;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T popItem() {
		if (this.isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		} else {
			return (T) this.stackArray[this.stackTop--];
		}
	}
}
