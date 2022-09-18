package com.array_related_programs;

public class PrintFirstEvenAndThenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,4,8,11,10};
		int arr[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				arr[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
				arr[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
