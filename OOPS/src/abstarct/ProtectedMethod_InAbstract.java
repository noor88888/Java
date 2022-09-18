package abstarct;
abstract class MyClass
{
	protected abstract void display();
}
public class ProtectedMethod_InAbstract extends MyClass
{
	public void display() 
	{
		System.out.println("This is the subclass implementation of the display method ");
	}
	public static void main(String[] args)
	{
		ProtectedMethod_InAbstract p=new ProtectedMethod_InAbstract();
		p.display();
	}

}
