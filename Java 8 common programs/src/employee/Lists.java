package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> lt=List.of("Noor","Asia","India","Bangalore");
		lt.forEach(System.out::println);
		
		List<Integer> lt1=List.of(9,7,2,8);
		lt.forEach(System.out::println);
		
		List<Integer> evenlist=lt1.stream().filter(i-> i % 2!=0).map(i->i+i).collect(Collectors.toList());
		evenlist.forEach(System.out::println);
		
	}

}
