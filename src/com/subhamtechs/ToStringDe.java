package com.subhamtechs;

public class ToStringDe {

	public static void main(String[] args) {

		Student student=new Student("subham", "123");
		System.out.println(student);
	}

}
class Student
{
	private String name;
	private String id;
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	}
