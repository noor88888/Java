package pre_defined;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f=(n)->n*n;//first argument is input type and the second argument is return type
		System.out.println(f.apply(5));
		System.out.println(f.apply(8));
		
		Function<String,Integer> f2=s->(s.length());
		System.out.println(f2.apply("Noor"));
		System.out.println(f2.apply("Ahamed"));
	}

}
