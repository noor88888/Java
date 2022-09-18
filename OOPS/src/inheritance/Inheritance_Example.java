package inheritance;
class Vehicle
{
	void start()
	{
		System.out.println("started");
	}
}
class Car extends Vehicle
{
	void display() 
	{
		System.out.println("car started");
	}	
}
class Bike extends Vehicle
{
	void display() 
	{
		System.out.println("bike started");
	}
}
public class Inheritance_Example
{
	public static void main(String args[])
	{
		Vehicle v= new Vehicle();
		v.start();
		Car v1= new Car();
		v1.start();
		v1.display();
		Bike v2= new Bike();
		v2.start();
		v2.display();
	}
}





