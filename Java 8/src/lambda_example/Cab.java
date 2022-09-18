package lambda_example;

public interface Cab
{
    public void Book(String Source ,String Destination);
}
class Car
{
	//THIS IS ONLY ONE STATEMENT WITHOUT RETURN
	public static void main(String args[])
	{
		Cab c=(Source,Destination)->System.out.println("your source:"+Source+" "+"Destination:"+Destination);
		c.Book("a1","d1");
	}
}