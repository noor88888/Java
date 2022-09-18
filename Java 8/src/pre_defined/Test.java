package pre_defined;
import java.util.function.Predicate;
public class Test 
{
	public static void main(String[] args) 
	{	
		Predicate<Integer> p=(i)->i<5;
		System.out.println(p.test(2)); //Test is the default method of Predicate Interface.
		System.out.println(p.test(6));
		
		Predicate<String> p2=s->(s.length()>5);
		System.out.println(p2.test("Noor"));
		System.out.println(p2.test("Ahamed"));
	}

}
