package com.ds.Stack;

public class StackArray {
	Object[] stackArray;
	int size;
	int stackTop;

	public StackArray(int size) {
		this.size = size;
		this.stackArray = new Object[this.size];
		this.stackTop = -1;
	}

}
