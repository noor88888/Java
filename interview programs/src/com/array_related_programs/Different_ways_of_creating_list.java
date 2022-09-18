package com.array_related_programs;

import java.util.*;

public class Different_ways_of_creating_list
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(7);
		System.out.println(l);
		System.out.println(l.contains(5));
		
		List<Integer> l1=Arrays.asList(1,2,3,5); //This is Immutable list so it gives error if we add any value
		//l1.add(6);
		System.out.println(l1);
		
		 List<Integer> l2=List.of(1,2,3,5); //This is Immutable list so it gives error if we add any value
		 //l2.add(7); 
		 System.out.println(l2);
		 
	}
}
