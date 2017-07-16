package com.ds.Queue;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		QueueLinkedList<String> myQueue = new QueueLinkedList<String>();
		myQueue.queue("Dhiraj");
		myQueue.queue("Borade");
		myQueue.queue("Prajakta");
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
	}

}
 