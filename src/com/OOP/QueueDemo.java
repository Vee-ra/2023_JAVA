package com.OOP;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue -> FIFO

public class QueueDemo {

	public static void main(String[] args) {

		Queue que = new LinkedList<>();
		que.add(null);
		que.add("Vel");
		que.add(12);
		que.add('S');

		System.out.println("Head is " + que.peek());

		// System.out.println("que removed " + que.remove()); // if que is empty it'll
		// through error
		System.out.println("que removed " + que.poll()); // if que is empty it'll through "NULL"

		System.out.println("Head is " + que.peek());

		System.out.println(que.size());

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(23);
		pq.add(9);
		System.out.println(pq.peek());
		System.out.println(pq);

	}

}
