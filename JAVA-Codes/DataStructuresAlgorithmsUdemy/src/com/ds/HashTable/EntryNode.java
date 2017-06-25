package com.ds.HashTable;

public class EntryNode {

	private int key;
	private Object value;
	public EntryNode next;

	public EntryNode(int key, Object value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public EntryNode() {
		this.next = null;
	}

	public int getKey() {
		return this.key;
	}

	public Object getValue() {
		return this.value;
	}
}
