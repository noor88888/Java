package com.string_related_programs;

public class NumberReverse 
{
	void string_Buffer()
	{
		int num=567;
		System.out.println("Number reverse");
	    StringBuffer sbr = new StringBuffer(String.valueOf(num));
	    StringBuffer reverse =sbr.reverse();
	    System.out.println("Using String Buffer"+reverse);
	}
	void string_Builder()
	{
		int num=759;
		System.out.println("Number reverse");
        StringBuilder str2 = new StringBuilder();
        str2.append(num);
        StringBuilder reverse=str2.reverse();     // used string builder to reverse
        System.out.println("Using String Builder"+reverse);
	}
}
