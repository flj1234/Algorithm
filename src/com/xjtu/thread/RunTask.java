package com.xjtu.thread;

public class RunTask implements Runnable {

	@Override
	public void run() {
		for (int idx = 1; idx <= 10; idx++) {
			System.out.println("子线程：我还活着" + idx);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
