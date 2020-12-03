package com.aakash.ihs;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		try {
			Demo d = new Demo();
			Thread t1 = new Thread(() -> {
				try {
					d.m1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});

			Thread t2 = new Thread(() -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				d.m3();
				d.m2();
			});

			t2.start();
			t2.join();
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// class level blocking
	public static synchronized void m1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("m1");
	}

	// object Level blocking
	public synchronized void m2() {
		System.out.println("m2");
	}

	public void m3() {
		System.out.println("m3");
	}

}