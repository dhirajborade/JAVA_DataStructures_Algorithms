package com.ds.Stack;

public class StackDynamicArrayDemo {

	public static void main(String[] args) {
		StackDynamicArray<Integer> myStack = new StackDynamicArray<>(2);
		System.out.println(myStack.getSize());
		myStack.pushItem(10);
		myStack.pushItem(10);
		System.out.println(myStack.getSize());
		myStack.pushItem(10);
		System.out.println(myStack.getSize());
		myStack.popItem();
		System.out.println(myStack.getSize());
		myStack.pushItem(10);
		myStack.pushItem(10);
		myStack.pushItem(10);
		System.out.println(myStack.getSize());
	}

}
