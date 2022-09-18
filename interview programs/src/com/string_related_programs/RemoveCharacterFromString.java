package com.string_related_programs;

public class RemoveCharacterFromString 
{
	public static void main(String[] args) 
	{	
		String s="CloudTeCh";
		System.out.println("Inbuilt Method :"+s.replace("T", ""));
		String str="CloudTeCh";
		char c = 'C';
		String finalstr="";
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=c)
			{
				finalstr=finalstr+str.charAt(i);
			}
		}
		System.out.println("Own method :"+finalstr);
		
	}

}
