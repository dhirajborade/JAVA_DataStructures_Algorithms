package com.ds.Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Student> myPriorityQueue = new PriorityQueue<Student>();
		myPriorityQueue.add(new Student("Dhiraj", 26));
		myPriorityQueue.add(new Student("Prajakta", 22));
		myPriorityQueue.add(new Student("Meghana", 24));
		myPriorityQueue.add(new Student("Borade", 20));
		System.out.println(myPriorityQueue.poll().studentName);
	}

}
