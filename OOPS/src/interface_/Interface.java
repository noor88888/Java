package interface_;
interface Calculator
{
	int n=10;//by default compilers will add public static final to all variables 
	public static final int m=8;//we can also add the default parameters (public static final) it will not cause error
	void add(); // by default public abstract will be added by compiler (public abstract void add)
	public abstract void div();//we can also add the default parameters (public abstract) it will not cause error
	void display();
	default void name()
	{
		System.out.println("In default method");
	}
	
}
class Calculator1 implements Calculator
{
	public void add()//we need to add public key word
	{
		int a=2;
		int b=2;
		int c=a+b;
		System.out.println("Addition :"+c);
	}
	public void div() 
	{
		int a=2;
		int b=2;
		int c=a/b;
		System.out.println("Division :"+c);	
	}
	public void display()
	{
		System.out.println("n : "+n);
		System.out.println("m : "+m);
	}
}
class Calculator2 implements Calculator
{
	public void add()
	{
		int a=8;
		int b=2;
		int c=a+b;
		System.out.println("Addition :"+c);
	}
	public void div() 
	{
		int a=32;
		int b=4;
		int c=a/b;
		System.out.println("Division :"+c);	
	}
	public void display()
	{
		System.out.println("n : "+n);
		System.out.println("m : "+m);
	}
}

public class Interface 
{
	public static void main(String[] args)
	{
		Calculator c1 =new Calculator1();
		c1.add();
		c1.div();
		c1.display();
		c1.name();
		System.out.println("_____________________________________________");
		Calculator c2 =new Calculator2();
		c2.add();
		c2.div();
		c2.display();
		c2.name();
	}
}
