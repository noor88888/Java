package com.array_related_programs;

public class Swaping 
{
	void method1()
	{
		int a=8;
		int b=7;
		System.out.println("Swaping without 3rd variable");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a+" "+"b :"+b);
	}
	void method2()
	{
		int a=4;
		int b=7;
		int temp;
		System.out.println("Swaping with 3rd variable");
		temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a+" "+"b :"+b);
	}
	public static void main(String[] args) 
	{
		Swaping s1=new Swaping();
		s1.method1();
		s1.method2();	
	}
}
