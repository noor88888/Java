package com.string_related_programs;
import java.util.*;
public class Reverse 
{
	  void charAt_method()
	  { 
		  String str="ahamed" ,nstr=""; char c;
		  System.out.println("Using charAt"); 
		  for(int i=0;i<str.length();i++) 
		  {
			  c=str.charAt(i); 
			  nstr=c+nstr; 
		  }
		  System.out.println("Reverse String"+":"+nstr); //just add this code to chcek if the string is palendrome or not 
		  if(str.equals(nstr)) 
		  {
			  System.out.println(str +": is palendraome"); 
		  } 
		  else 
		  { 
			  System.out.println(str +": is not palendraome"); 
		  } 
	  }
	 
	void charArray_method()
	{
		String s="keyboard";
		char reverse = 0;
		char[] ch=s.toCharArray();
		System.out.println("Using charArray");
		for(int i= s.length()-1;i>=0;i--)
		{
			reverse=ch[i];
			System.out.println(reverse);
		}
		if(s.equals(reverse)) 
		{
			  System.out.println(s +": is palendraome"); 
		} 
		else 
		{ 
			System.out.println(s +": is not palendraome"); 
		} 
	}
	  void ReverseSplit_method() 
	  {
		  String s1="keyboard"; 
		  String[] s2=s1.split("");
		  System.out.println("Reverse_Split_Method"); 
		  for(int i=s2.length-1;i>=0;i--) 
		  {
			  System.out.println(s2[i]+" "); 
		  } 
	  }
}
