package lambda_example;

public interface Cab1 
{
	public String Book(String Source ,String Destination);
}
class Car1
{
	//THIS IS ONLY ONE STATEMENT WITH RETURN
	public static void main(String args[])
	{
		Cab1 c1=(Source,Destination)->{
			System.out.println("your trip source:"+Source+" "+"Destination:"+Destination);
			return ("Price of trip is 1000");
		};
		c1.Book("a1","d1");
	}
}