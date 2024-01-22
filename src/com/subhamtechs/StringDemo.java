package com.subhamtechs;

class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("bhaskar");
		String s2 = s1.intern();
		System.out.println(s1 == s2); // false
		String s3 = "bhaskar";
		System.out.println(s2 == s3);// true
		
		char[] ch = {'a','b','c'};
		byte[] by = {1,2,4,5,100};
		String string=new String(ch);
		System.out.println(string);
		String byString=new String(by);
		System.out.println();
		System.out.println(byString);
		
	}
}