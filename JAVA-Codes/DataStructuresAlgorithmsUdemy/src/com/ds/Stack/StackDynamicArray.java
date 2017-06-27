package com.ds.Stack;

import java.util.Arrays;

public class StackDynamicArray<T> {
	Object[] stackDynamicArray;
	int size;
	int stackTop;
	private int requiredCapacity, currentCapacity, newCapacity;

	public StackDynamicArray(int size) {
		this.size = size;
		this.stackDynamicArray = new Object[this.size];
		this.stackTop = -1;
	}

	public StackDynamicArray() {
		this.stackDynamicArray = new Object[1];
		this.stackTop = -1;
	}

	private boolean isEmpty() {
		return (this.stackTop == -1);
	}

	public int getSize() {
		return this.stackDynamicArray.length;
	}

	public void pushItem(Object item) {
		this.requiredCapacity = this.stackTop + 2;
		this.currentCapacity = this.getSize();
		if (this.requiredCapacity > this.currentCapacity) {
			this.newCapacity = this.currentCapacity * 2;
			if (this.newCapacity < this.requiredCapacity) {
				this.newCapacity = this.requiredCapacity;
			}
			this.stackDynamicArray = Arrays.copyOf(stackDynamicArray, newCapacity);
		}
		this.stackTop++;
		this.stackDynamicArray[this.stackTop] = item;
	}

	@SuppressWarnings("unchecked")
	public T popItem() {
		if (this.isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		} else {
			return (T) this.stackDynamicArray[this.stackTop--];
		}
	}
}
