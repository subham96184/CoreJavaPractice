package com.subhamtechs;

 class MyThread3 extends Thread {
}

class ThreadPriorityDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());// 5
		Thread.currentThread().setPriority(9);
		MyThread3 t = new MyThread3();
		System.out.println(t.getPriority());// 9
	}
}