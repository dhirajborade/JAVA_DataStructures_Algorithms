package com.ds.Queue;

public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray<Integer> myQueue = new QueueArray<>(3);
		myQueue.Queue(1);
		myQueue.Queue(1);
		myQueue.Queue(1);
		myQueue.Queue(1);
		System.out.println(myQueue.DeQueue());
		System.out.println(myQueue.DeQueue());
		System.out.println(myQueue.DeQueue());
		System.out.println(myQueue.DeQueue());
	}
}
