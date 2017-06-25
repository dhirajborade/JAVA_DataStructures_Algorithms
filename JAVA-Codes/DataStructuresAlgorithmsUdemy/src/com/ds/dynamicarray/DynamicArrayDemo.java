package com.ds.dynamicarray;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		DynamicArray<Integer> myDArray = new DynamicArray<Integer>();
		myDArray.putElement(10);
		System.out.println("Size: " + myDArray.getSize());
		myDArray.putElement(23);
		System.out.println("Size: " + myDArray.getSize());
		myDArray.putElement(232);
		System.out.println("Size: " + myDArray.getSize());
		myDArray.putElement(54);
		System.out.println("Size: " + myDArray.getSize());
		myDArray.putElement(123423);
		System.out.println("Size: " + myDArray.getSize());
		myDArray.putElement(756);
		System.out.println("Size: " + myDArray.getSize());
		myDArray.putElement(44);
		System.out.println("Size: " + myDArray.getSize());
		for (int i = 0; i < myDArray.getSize(); i++) {
			System.out.println(myDArray.getElement(i));
		}

	}

}
