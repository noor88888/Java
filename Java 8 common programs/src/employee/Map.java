package employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Map
{
	public static void main(String[] args)
	{
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"abc",2234,"devloper",24));
		emp.add(new Employee(2,"xyz",5623,"Testing",26));
		emp.add(new Employee(3,"pqr",8726,"Deployment",21));
		emp.add(new Employee(4,"iop",3221,"Management",25));
		emp.add(new Employee(11,"abc",6587,"devloper",34));
		emp.add(new Employee(22,"xyz",6314,"Testing",35));
		emp.add(new Employee(33,"pqr",7891,"Deployment",29));
		emp.add(new Employee(44,"iop",7241,"Management",28));
		
		System.out.println("Condition 1");
		List<Employee> temp=emp.stream().map(
			  e->{
					  if(e.getAge()>25) 
					  {
						  e.setSal(e.getSal()*1.10); 
					  } 
					  return e; 
				  } 
			  ).collect(Collectors.toList());
	  System.out.println(temp);
		 
	  System.out.println("Condition 2");
	  emp.stream().map(
	  e->{
		  	if(e.getDept().equalsIgnoreCase("Testing") && e.getAge()>29)
			{
		  		e.setSal(e.getSal()*(15%100));
			}
			return e;
	     }
		).forEach(System.out::println);
	}
}
