package com.subhamtechs;

public class ConstructTest {
	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println(c.hashCode());
	}
}
	abstract class Parent1 {
		Parent1() {
			System.out.println(this.hashCode());
		}
	}

	class Child1 extends Parent1 {
		Child1() {
			System.out.println(this.hashCode());
		}
	}

	




