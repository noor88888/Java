package polymorphism;
class Helper
{
	 int Multiply(int a, int b) 
	 {
		 
		return a * b;
	 }
	 double Multiply(double a, double b) 
	 {
		return a * b;
	 }
}
public class Overloading1_Example 
{
	public static void main(String[] args) 
	{
		Helper h = new Helper();
		System.out.println(h.Multiply(2, 4));
		System.out.println(h.Multiply(5.5, 6.3)); 
	}

}
