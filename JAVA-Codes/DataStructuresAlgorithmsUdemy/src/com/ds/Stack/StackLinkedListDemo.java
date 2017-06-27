package com.ds.Stack;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();
		myStack.pushItem(12);
		myStack.pushItem(14);
		myStack.pushItem(13);
		while(myStack.popItem() != null) {
			System.out.println(myStack.popItem());
		}
		myStack.popItem();
	}

}
