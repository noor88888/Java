package com.duplicate;
import java.util.*;
public class NonRepeating_UniqueNumbers
{
	 static void findNonRepeatingElement()
	 {
		 int nums[] = {8,1,2,2,4,6};
		 boolean chk;
		 List<Integer> b = new ArrayList<>();
		 for(int i=0;i<nums.length;i++)
		 {
			 chk = false;
		     for(int j=0;j<nums.length;j++) 
		     {
		    	 if(i != j && nums[i] == nums[j])
		         {
		    		 chk = true;
		             break;
		         }
		      }
		      if(!chk)
		      //System.out.println(nums[i]); //if we dont want to add to list
		      b.add(nums[i]);
		    }
		    System.out.println("Non repeating numbers "+b);
		    System.out.print("First Non repeating numbers "+b.get(0));
		    System.out.println();
		    System.out.print("Even non repeating numbers :");
		    for (int i = 0; i < b.size(); i++)
		    {
		    	if(b.get(i)%2==0)
		    	{
		    		System.out.println(b.get(i));
		    	}
	        } 
		    System.out.println();
		    System.out.print("First two numbers:"+b.get(0)+","+b.get(1));
		    System.out.println();
		    System.out.print("Last two numbers:"+b.get(b.size()-1)+","+b.get(b.size()-2)); 
		    Collections.sort(b); System.out.println();
		    System.out.println("Sorted List: "+b);
			 
		}
		public static void main(String[] args) 
		{
			findNonRepeatingElement();
		}    
}
   	

