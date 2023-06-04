package com.OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsDemo {

	public static void main(String[] args) {

		int arr[] = new int[5]; // fixed size

		ArrayList<Integer> alist = new ArrayList<Integer>(); // flexible and supports redundancy

		for (int i = 1; i <= 10; i++) {
			alist.add(i);
		}
		System.out.println(alist);

		alist.get(5);
		alist.add(2, 200);
		System.out.println(alist.contains(7));
		alist.remove(4);
		System.out.println(alist);

		System.out.println("Using for each");
		for (int i : alist) {
			System.out.println(i);
		}

		Iterator<Integer> i = alist.iterator();
		System.out.println("Using Iterator");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Veera");
		slist.add("Sakthive");
		System.out.println(slist);

		ArrayList all = new ArrayList();
		all.add(12);
		all.add("String");
		all.add('c');
		System.out.println(all);

		LinkedList Linklist = new LinkedList<>();
		Linklist.add("Vel");
		Linklist.add(12);
		Linklist.add('V');
		System.out.println(Linklist);

		// Vector -> Thread safe implementation

	}

}
