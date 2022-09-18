package com.duplicate;

import java.util.HashSet;

public class NonRepeating_UniqueNumbers_2ndWay 
{
	static void FirstTwoNonRepeating()
	{
		int arr[] = {8,1,2 , 2 ,4 ,6};
	    int n = arr.length;
	    
	    HashSet<Integer> hs=new HashSet();
	    
	    for(int i=0;i<n;i++)
	    {
	    	if (hs.contains(arr[i]))
	    	{
	    		hs.remove(arr[i]);
	    	}
	    	else
	    	{
	    		hs.add(arr[i]);
	    	}
	    }
	    System.out.print("The 2 non repeating numbers are : ");
	    for (int it : hs)
	    System.out.print(it + " ");
	    System.out.println();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FirstTwoNonRepeating();
	}

}
