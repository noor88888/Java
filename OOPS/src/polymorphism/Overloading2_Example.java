package polymorphism;
class Calculate 
{
    int Multiply(int a, int b)
    {
        return a * b;
    }
    int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}
public class Overloading2_Example 
{
	public static void main(String[] args) 
	{
		Calculate c=new Calculate();
		System.out.println(c.Multiply(8, 8));
		System.out.println(c.Multiply(9, 9,1));
	}

}
