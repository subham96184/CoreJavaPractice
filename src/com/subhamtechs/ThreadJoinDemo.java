package com.subhamtechs;

class MyThread5 extends Thread {
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch ( InterruptedException e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		//MyThread5 t = new MyThread5();
	//	System.out.println(Thread.currentThread().getName());
		MyThread5 mt=(MyThread5) Thread.currentThread();
		MyThread5 t = new MyThread5();
		t.start();
		Thread.sleep(2000);
		//t.join(); // --->1
		for (int i = 0; i < 5; i++) {
			System.out.println("Rama Thread");
		}
	}
}