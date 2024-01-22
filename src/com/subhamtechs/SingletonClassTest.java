package com.subhamtechs;

public class SingletonClassTest {

	private static SingletonClassTest t=null;
	public SingletonClassTest()
	{

	}
	public static SingletonClassTest getTest()
	{
		if (t==null) {
			t=new SingletonClassTest();
		}
		return t;
	}
	public static void main(String[] args) {
		
		System.out.println(SingletonClassTest.getTest().hashCode());
		System.out.println(SingletonClassTest.getTest().hashCode());
		System.out.println(SingletonClassTest.getTest().toString());
		System.out.println(SingletonClassTest.getTest().toString());
	}

}
