package com.ds.Cache;

import java.util.HashMap;
import java.util.Random;

public class LRUCache {
	private int cacheCapacity;
	private LinkedListNode head = null;
	private LinkedListNode tail = null;
	private HashMap<Integer, LinkedListNode> hMap = new HashMap<Integer, LinkedListNode>();

	public LRUCache(int cacheCapacity) {
		this.cacheCapacity = cacheCapacity;
	}

	private int getCacheCapacity() {
		return this.cacheCapacity;
	}

	private void removeNode(LinkedListNode inputNode) {
		if (inputNode.getPrevious() != null) {
			inputNode.getPrevious().setNext(inputNode.getNext());
		} else {
			this.head = inputNode.getNext();
		}
		if (inputNode.getNext() != null) {
			inputNode.getNext().setPrevious(inputNode.getPrevious());
		} else {
			this.tail = inputNode.getPrevious();
		}
	}

	private void setHead(LinkedListNode inputNode) {
		inputNode.setNext(this.head);
		inputNode.setPrevious(null);
		if (this.head != null) {
			this.head.setPrevious(inputNode);
		}
		this.head = inputNode;
		if (this.tail == null) {
			this.tail = this.head;
		}
	}

	public void insertItem(int key, int value) {
		if (hMap.containsKey(key)) {
			LinkedListNode presentNode = hMap.get(key);
			presentNode.setValue(value);
			this.removeNode(presentNode);
			this.setHead(presentNode);
		} else {
			LinkedListNode newNode = new LinkedListNode(key, value);
			if (hMap.size() >= this.getCacheCapacity()) {
				hMap.remove(this.tail.getKey());
				this.removeNode(this.tail);
				this.setHead(newNode);
			} else {
				this.setHead(newNode);
			}
			hMap.put(key, newNode);
		}
	}

	public int getItem(int key) {
		if (hMap.containsKey(key)) {
			LinkedListNode tempNode = hMap.get(key);
			this.removeNode(tempNode);
			this.setHead(tempNode);
			return tempNode.getValue();
		}
		return -1;
	}

	public static void main(String[] args) {
		LRUCache myLRUCache = new LRUCache(4);
		/*for (int i = 0 ; i < 5 ; i++) {
			int inputValue = generateRandomNumber();
			myLRUCache.insertItem(i, inputValue);
		}
		System.out.println(myLRUCache.getItem(0));
		System.out.println(myLRUCache.getItem(1));
		System.out.println(myLRUCache.getItem(2));
		System.out.println(myLRUCache.getItem(3));
		System.out.println(myLRUCache.getItem(4));
		System.out.println(myLRUCache.getItem(4));
		System.out.println(myLRUCache.getItem(5));*/
		
		myLRUCache.insertItem(0, 12);
		myLRUCache.insertItem(12, 345);
		myLRUCache.insertItem(234, 75);
		myLRUCache.insertItem(745, 342);
		myLRUCache.insertItem(4453, 774);
		System.out.println(myLRUCache.getItem(12));
		myLRUCache.insertItem(23, 32322);
		System.out.println(myLRUCache.getItem(12));
		System.out.println(myLRUCache.getItem(234));
	}
	
	public static int generateRandomNumber() {
		Random randomNumber = new Random(); 
		int value = randomNumber.nextInt(50);
		return value;
	}
}
