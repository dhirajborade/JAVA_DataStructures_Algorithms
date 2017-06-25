package com.ds.HashTable;

public class HashMapArray<T> {
	EntryNode[] hashMap;
	int size;

	public HashMapArray(int size) {
		this.size = size;
		this.hashMap = new EntryNode[size];
		for (int i = 0; i < size; i++) {
			this.hashMap[i] = new EntryNode();
		}
	}

	private int getHash(int key) {
		return key % this.size;
	}

	public void insertItem(int key, Object value) {
		int hashArrayIndex = this.getHash(key);
		EntryNode hashArrayEntry = this.hashMap[hashArrayIndex];
		EntryNode newItem = new EntryNode(key, value);
		newItem.next = hashArrayEntry.next;
		hashArrayEntry.next = newItem;
	}
	
	@SuppressWarnings("unchecked")
	public T getItem(int key) {
		T value = null;
		int hashArrayIndex = this.getHash(key);
		EntryNode hashArrayEntry = this.hashMap[hashArrayIndex];
		while(hashArrayEntry != null) {
			if(hashArrayEntry.getKey() == key) {
				value = (T) hashArrayEntry.getValue();
				break;
			}
			hashArrayEntry = hashArrayEntry.next;
		}
		return value;
	}
}
