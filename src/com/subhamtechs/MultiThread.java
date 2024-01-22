package com.subhamtechs;

public class MultiThread {

	public static void main(String[] args) {
     Thread1 thread1=new Thread1();
     thread1.setPriority(9);
     thread1.start();
     for (int i = 0; i < 10; i++) {
    	 System.out.println("main thread");	
	}
   
	}}
 class Thread1 extends Thread
{
	@Override
	public void run() {
		 for (int i = 0; i < 10; i++) {
	    	 System.out.println("child thread");	
		}
	}
	}

