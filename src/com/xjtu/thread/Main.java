package com.xjtu.thread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new RunTask());
		Thread t2 = new Thread(new MyThread2());
		t1.start();
		t2.start();
		while (t1.isAlive()) {
			Thread.sleep(1000);
			System.out.println("主线程：子线程1状态为" + t1.isAlive());
			System.out.println("主线程：子线程2状态为" + t2.isAlive());
		}
	}
}
