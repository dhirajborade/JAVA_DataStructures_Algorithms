package com.ds.LinkedList;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		SingleLinkedList<String> myStringList = new SingleLinkedList<String>();
		SingleLinkedList<Integer> myIntegerList = new SingleLinkedList<Integer>();
		myStringList.insertNode("Dhiraj");
		myStringList.insertNode("Borade");
		myStringList.insertNode("Prajakta");
		myStringList.insertNode("Karandikar");
		myIntegerList.insertNode(1);
		myIntegerList.insertNode(2);
		myIntegerList.insertNode(3);
		myIntegerList.insertNode(4);
		System.out.println("=============");
		System.out.println("Before Delete");
		System.out.println("=============");
		myStringList.displayList();
		myIntegerList.displayList();
		myStringList.deleteNode();
		myIntegerList.deleteNode();
		System.out.println("============");
		System.out.println("After Delete");
		System.out.println("============");
		myStringList.displayList();
		myIntegerList.displayList();
	}
}
