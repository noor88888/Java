package final_keyword;
class A
{
	/* final */ void display()  //IF WE HAVE A PARENT CLASS METHOD AS FINAL THEN THEN THE FINAL METHOD CANT BE OVERRIDDEN 
	{
		System.out.println("In parent method");
	}
}
class B extends A
{
	 final  void display() //WE CAN HAVE A CHILD CLASS AS FINAL BUT THIS FINAL METHOD CANT BE OVERRIDEN BY ANOTHER CHILD CLASS
	{
		System.out.println("In child method");
	}
}
public class FinalMethod
{
	public static void main(String[] args)
	{
		A parent =new A();
		parent.display();
		
		A parent1 =new B();
		parent1.display();

	}

}
