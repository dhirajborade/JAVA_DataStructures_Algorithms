package com.ds.Queue;

public class QueueDynamicArrayDemo {

	public static void main(String[] args) {
		QueueDynamicArray<Integer> myQueue = new QueueDynamicArray<Integer>(2);
		myQueue.Queue(11);
		myQueue.Queue(11);
		myQueue.Queue(11);
		myQueue.Queue(11);
		myQueue.Queue(11);
		System.out.println(myQueue.getSize());
		System.out.println(myQueue.DeQueue());
		System.out.println(myQueue.DeQueue());
	}

}
