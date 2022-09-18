package com.duplicate;
import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		 ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	     System.out.print("With duplicates :"+numbersList);
	     LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList); 
	     ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
	     System.out.println();
	     System.out.print("Without duplicates:"+listWithoutDuplicates);
	     
	     System.out.println();
	     ArrayList<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	     System.out.println("Using Java 8");
	     System.out.print("With duplicates :"+numbersList1);
	     List<Integer> listWithoutDuplicates1 = numbersList.stream().distinct().collect(Collectors.toList());
	     System.out.println();
	     System.out.print("Without duplicates:"+listWithoutDuplicates1);
	}
}
