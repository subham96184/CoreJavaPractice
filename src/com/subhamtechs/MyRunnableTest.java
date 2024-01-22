package com.subhamtechs;

public class MyRunnableTest {

	public static void main(String[] args) {
		 Thread2 thread1=new Thread2();
		 Thread thread=new Thread(thread1);
		 
	     thread.start();
	     for (int i = 0; i < 10; i++) {
	    	 System.out.println("main thread");	
	}
	}
}
class Thread2 implements Runnable
{
	@Override
	public void run() {
		 for (int i = 0; i < 10; i++) {
	    	 System.out.println("child thread");	
		}
	}
	}
