package com.lab_assignment_5_Q2;

import java.util.*;

class Multithread implements Runnable {
	int num;

	public Multithread(int a) {
		this.num = a;
	}

	public void run() {
		add();
	}

	public void add() {
		Random rand = new Random();
		int rad = rand.nextInt(10) + 1;
		System.out.println("Random number :" + rad);
		synchronized (this) {
			num += rad;
		}
	}
}

public class Randomize {
	public static void main(String[] args) {
		int a = 0;
		Multithread sum1 = new Multithread(a);
		Thread t1 = new Thread(sum1);
		Thread t2 = new Thread(sum1);
		Thread t3 = new Thread(sum1);
		Thread t4 = new Thread(sum1);
		Thread t5 = new Thread(sum1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.print("Final Result: " + sum1.num);
	}
}
