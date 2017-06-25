package com.ds.Cache;

public class LinkedListNode {
	private int key;
	private int value;
	private LinkedListNode next;
	private LinkedListNode previous;

	public LinkedListNode(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public LinkedListNode getNext() {
		return this.next;
	}
	
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
	public LinkedListNode getPrevious() {
		return this.previous;
	}
	
	public void setPrevious(LinkedListNode previous) {
		this.previous = previous;
	}
}
