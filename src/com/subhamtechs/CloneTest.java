package com.subhamtechs;

public class CloneTest implements Cloneable{

	int i =10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
	  CloneTest test=new CloneTest();
      CloneTest test2=(CloneTest) test.clone();
      test2.i=100;
      test2.j=200;
      System.out.println(test.i +"....."+test.j);
      System.out.println(test2.i +"....."+test2.j);
	}

}
