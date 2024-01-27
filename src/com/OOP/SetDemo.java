package com.OOP;

import java.util.HashSet;
import java.util.LinkedHashSet;

//Set - only unique elements

//Hashset - Hashing technique

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<>(); // No orders,no redundancy, no duplicate

		h.add(12);
		h.add(32);
		h.add(12);
		System.out.println(h);

		LinkedHashSet<String> lh = new LinkedHashSet<>(); // orders, no redundancy, no duplicate
		lh.add("Veera");
		lh.add("Sakthi");
		lh.add("Veera");
		System.out.println(lh);

	}

}
