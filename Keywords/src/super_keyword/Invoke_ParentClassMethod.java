package super_keyword;
class StreetDog
{  
	void eat()
	{
		System.out.println("StreetDog eating...");
	}  
}  
class HouseDog extends StreetDog
{  
	void eat()
	{
		System.out.println("HouseDog eating bread...");
	}  
	void bark()
	{
		System.out.println("HouseDog barking...");
	}  
	void work()
	{  
		super.eat();  
		bark();  
	}  
}  
public class Invoke_ParentClassMethod {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HouseDog d=new HouseDog();  
		d.work();  
	}

}
