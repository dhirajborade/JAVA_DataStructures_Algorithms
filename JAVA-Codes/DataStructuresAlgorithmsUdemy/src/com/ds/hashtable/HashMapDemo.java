package com.ds.hashtable;

import java.util.Random;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMapArray<String> hMap = new HashMapArray<String>(100);
		for (int i = 0 ; i < 100 ; i++) {
			String inputStr = generateString();
			hMap.insertItem(i, inputStr);
			//System.out.println(inputStr);
		}
//		hMap.insertItem(1, "Dhiraj");
//		hMap.insertItem(2, "Borade");
//		hMap.insertItem(3, "Prajakta");
//		hMap.insertItem(4, "Karandikar");
//		hMap.insertItem(5, "Florida");
		System.out.println(hMap.getItem(5));
		System.out.println(hMap.getItem(10));
		System.out.println(hMap.getItem(30));
		System.out.println(hMap.getItem(58));
		System.out.println(hMap.getItem(23));
		System.out.println(hMap.getItem(100));
	}

	public static String generateString() {
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int length = 10;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
		}
		return sb.toString();
	}

}
