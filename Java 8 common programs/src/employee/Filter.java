package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter
{
	private static String name;

	public static void main(String[] args)
	{
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"abc",2234,"devloper",24));
		emp.add(new Employee(2,"xyz",5623,"Testing",26));
		emp.add(new Employee(3,"plqr",8726,"Deployment",21));
		emp.add(new Employee(4,"iopp",3221,"Management",25));
		 
		emp.add(new Employee(11,"abc",6587,"devloper",34));
		emp.add(new Employee(22,"xyz",6314,"Testing",35));
		emp.add(new Employee(33,"pqr",7891,"Deployment",29));
		emp.add(new Employee(44,"iop",7241,"Management",28));
		
		emp.forEach(System.out::println);
		
		List<Employee> temp=emp.stream().filter(
				e->e.getDept().equalsIgnoreCase("devloper") && e.getAge() >25)
				.collect(Collectors.toList());
		
		temp
		.forEach(e->System.out.println
				("id:"+e.getId()+" "+"name:"+e.getName()+" "+"salary:"+e.getSal()+" "+"Department:"+e.getDept()+" "+"Age:"+e.getAge()));
		
		emp.stream().filter(e->e.getName().length()>3).forEach(System.out::println);
	}
}
