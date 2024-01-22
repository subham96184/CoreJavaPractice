package com.subhamtechs;

public class MethodSign {

	public void m1() {
		System.out.println("Empty method call");
	}
	public void m1(float i) {
		System.out.println("Integer method call");
	}
	public static void main(String[] args) {
		MethodSign test= new MethodSign();
		test.m1();
		test.m1();
		
	}

}

