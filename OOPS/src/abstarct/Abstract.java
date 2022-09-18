package abstarct;
abstract class Vehicle
{
	String name;
	int abc;//public static will be added by default
	abstract void start();
	void show()
	{
		System.out.println("In non abstract method");
	}
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("key");
	}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("kick");
	}
}
public class Abstract
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
		System.out.println(b.name="Noor  ");
		b.start();
		b.show();
		
		Car c=new Car();
		System.out.println(c.name="Ahamed ");
		c.start();
		c.show();
		
		
	}
}
