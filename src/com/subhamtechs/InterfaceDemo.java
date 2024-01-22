package com.subhamtechs;

interface It1 // abstract
{
	 final static int a=20;
	void m1(); // public abstract

	void m2();

	void m3();
}

class InterfaceDemo implements It1 {
	public void m1() {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		InterfaceDemo t = new InterfaceDemo();
		t.m1();
		t.m2();
		t.m3();
		It1 i = new InterfaceDemo();
		i.m1(); // compile : It1 runtime : Test
		i.m2(); // compile : It1 runtime : Tes
		i.m3();
		System.out.println(a);
	}
}