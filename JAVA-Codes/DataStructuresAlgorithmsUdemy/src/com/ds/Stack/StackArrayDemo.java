package com.ds.Stack;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> myStack = new StackArray<Integer>(5);
		myStack.pushItem(1);
		myStack.pushItem(2);
		myStack.pushItem(3);
		myStack.pushItem(4);
		myStack.pushItem(5);
		myStack.pushItem(6);
		System.out.println(myStack.popItem());
		System.out.println(myStack.popItem());
		System.out.println(myStack.popItem());
		System.out.println(myStack.popItem());
		System.out.println(myStack.popItem());
		System.out.println(myStack.popItem());
	}
}
