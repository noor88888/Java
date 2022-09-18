package com.array_related_programs;
public class CountSumOfX 
{
	static void Countsum()
	{
		int a[]={3,6,2,7,1,8,5};
	    int x=8;
	    int count=0;       
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	        {
	    		int y=a[i]+a[j];
	            if(y==x)
	            {
	             count ++;
	            }
	         }
	      }
	      System.out.println(count);	
	}
	public static void main(String args[]) 
	{
		Countsum();
	}
}
