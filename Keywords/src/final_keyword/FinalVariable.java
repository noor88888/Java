package final_keyword;
public class FinalVariable
{
	public static void main(String[] args) 
	{
		final int a=888;
		
		//a=99; WE CANT CHANGE THE FINAL VARIABLE BUT CAN PROVIDE REFERENCE TO ANOTHER VARIABLE
		
		int b=a;
		b=99;
		
		System.out.println("Final variable a:"+a);
		System.out.println("Final variable b:"+b);
	}

}
