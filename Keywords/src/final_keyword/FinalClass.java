package final_keyword;


/*final*/ class Method1 //IF WE USE FINAL KEYWORD WITH CLASS IT CANT BE EXTENDED
{
	void display()
	{
		System.out.println("In final method");
	}
}
class Method2 extends Method1
{
	void display()
	{
		System.out.println("In child method");
	}
}
public class FinalClass
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Method1 sc = new Method1();
		sc.display();
		Method1 sc1 = new Method2();
		sc1.display();
		/*
		 * Method2 sc2=(Method2) new Method1(); sc.display(); //WE GET EXCEPTION  cannot be cast to class final_keyword.Method2
		 */
	}

}
