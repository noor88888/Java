package com.array_related_programs;
import java.util.*;
public class Different_ways_of_creating_array
{
	public static void main(String[] args) 
	{
		//Method 1
		int a[]={1,2,3,4,5};
		System.out.println("Method 1 :"+Arrays.toString(a));
		
		//Method 2
		int a1[]=new int[5];
		a1[0]=2;
		a1[1]=5;
		a1[2]=6;
		a1[3]=7;
		a1[4]=9;
		//a1[5]=8;
		System.out.println("Method 2 :"+Arrays.toString(a1));
		
		//Method 3
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter tha value of n");
		n=s.nextInt();
		int a2[]=new int[n];
		System.out.println("Enter the array values");
		for(int i=0;i<a2.length;i++)
        {
            a2[i]=s.nextInt();
        }
		System.out.println("Method 3");
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}		
	}
}
