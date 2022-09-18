package static_keyword;
class JavaStaticClassExample  
{  
	private static String s= "Noor Ahamed S";  
	//Static and nested class  
	static class StaticNestedClass  
	{  
		//non-static method of the nested class  
		public void show()   
		{  
			//prints the string defined in base class  
			System.out.println(s);   
		}  
	}  
}
public class Static_Class 
{
	public static void main(String[] args)
	{
		System.out.println("A class can be declared static only if it is a nested class.");
		JavaStaticClassExample.StaticNestedClass obj = new JavaStaticClassExample.StaticNestedClass();  
		//invoking the method of the nested class  
		obj.show();  
	}

}
