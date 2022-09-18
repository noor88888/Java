package interface_;
interface Sayable
{  //WE CAN'T HAVE PROTECTED AS ACCESS MODIFIER FOR INTERFACE METHODS
	default void say()
	{  
        saySomething(); // Calling private method  
        sayPolitely(); //  Calling private static method  
    }  
    // Private method inside interface  
    private void saySomething()
    {  
        System.out.println("Hello... I'm private method");  
    }  
    // Private static method inside interface  
    static void sayPolitely()
    {  
        System.out.println("I'm private static method");  
    }  
}  
public class Private_MethodIn_Interface implements Sayable
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sayable s =new Private_MethodIn_Interface();
		s.say();
	}

}
