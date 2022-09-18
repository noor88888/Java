package com.array_related_programs;
import java.util.Arrays;
public class CompareArray 
{
	public static void main(String[] args)
	{
		if(check()) 
		{ 
			System.out.println("both arrray are same"); 
		} 
		else 
		{
			System.out.println("Both arrays are not same"); 
		}
	}
	static boolean check()
	{
		int a1[]= {1,2,5,4,8,11,10};
		int a2[]= {1,2,5,4,8,10,11};
		int m=a1.length;
		int n=a2.length;
		if(m!=n)
		{
			return false;
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0;i<m;i++) 
		{ 
			if(a1[i]!=a2[i]) 
			{ 
				return false; 
			} 
		} 
		return true;
	}
}
	
