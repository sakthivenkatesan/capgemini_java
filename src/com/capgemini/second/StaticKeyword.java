package com.capgemini.second;
class Stu
{
	public Stu(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	//nested static class
	static class Address
	{
		int door_no;
		void print()
		{
		System.out.println("This is a nested static class");
		}
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "School Name= " + schoolname + "]";
	}
	private int rollno;
	private String name;
	
	//static variable
	static String schoolname;
	
	//static block
	static
	{
		System.out.println("This is static block");
	}
	
	// static method
	public static void staticmethod()
	{
		System.out.println("School name = " + schoolname);
	}
}
public class StaticKeyword 
{
	public static void main(String [] args)
	{
		//static variable initialization
		Stu.schoolname = "ABC Higher Secondary School";
		
		//Object creation for class student
		Stu s1 = new Stu(101, "AAA");
		Stu s2 = new Stu(102, "BBB");
		Stu s3 = new Stu(103, "CCC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
		
		//Calling static method
		Stu.staticmethod();
		
		//Calling nested static block
		Stu.Address ad = new Stu.Address();
		ad.print();
	}
}
