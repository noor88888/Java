package com.duplicate;
import java.util.*;
public class PrintDuplicates 
{
	public static void main(String args[])
	{
		int [] arr = new int [] {8,1,2, 2 ,4,8 ,6}; 
		List<Integer> arrayNew=new ArrayList();
	    System.out.println("Duplicate elements in given array: ");    
	    for(int i = 0; i < arr.length; i++)
	    {  
	        for(int j = i + 1; j < arr.length; j++) 
	        {  
	            if(arr[i] == arr[j]) 
	            {
	            	arrayNew.add(arr[j]);
	            	//System.out.print(arr[j]+","); 
	            } 
	        }
	    }
	    System.out.println(arrayNew); 
	    
	    /*Converting to find even numbers*/
	    for (int i = 0; i < arrayNew.size(); i++)
	    {
	    	if(arrayNew.get(i)%2==0)
	    	{
	    		System.out.print(arrayNew.get(i)+",");
	    	}
	    }
	}
}

