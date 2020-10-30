package com.lab_assignment_5_Q1;

class MultiThreading implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Current Thread :" + Thread.currentThread().getName() + ":" + i);

		}
	}

}

public class MultiThread {
	public static void main(String[] args) {

		MultiThreading multithread = new MultiThreading();

		Thread thread1 = new Thread(multithread, "thread1");
		Thread thread2 = new Thread(multithread, "thread2");
		Thread thread3 = new Thread(multithread, "thread3");
		thread1.start();
		thread2.start();
		thread3.start();

	}
}
