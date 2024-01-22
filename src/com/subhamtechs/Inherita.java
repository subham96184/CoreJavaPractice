package com.subhamtechs;

public class Inherita {

	public static void main(String[] args) {
		Parent parent = new Child();
 // 		parent.c();
		Child child = new Child();
		child.c();
		child.p();
	}
}
class Parent {
	public void p() {
		System.out.println("parent method");
	}
}
class Child extends Parent {
	public void c() {
		System.out.println("child method");
	}
}