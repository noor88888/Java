package super_keyword;
class Vehical
{  
	Vehical()
	{
		System.out.println("Vehical is created");
	}  
}  
class Car extends Vehical
{  
	Car()
	{  
		super();  
		System.out.println("Car is created");  
	}  
}  
public class Invoke_parentClassConstructor
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car c=new Car();
	}

}
