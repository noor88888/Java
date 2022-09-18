package LargestNumber;
public class Type1 
{
	void Method1()
	{
		int a=10;
		int b=20;
		int c=8;
		System.out.println("method 1");
		if(a>b && a>c)
		{System.out.println("a is largest");}
		else if(b>a && b>c)
		{System.out.println("b is largest");}
		else
		{System.out.println("c is largest");}
	}
	void Method2()
	{
		int a=17;
		int b=25;
		int c=12;
		System.out.println("method 2");
		int temp = a>b?a:b;
		int largest = c>temp?c:temp;
		//we have combined all the statement
		//int largest=(a>b?a:b)>c?(a>b?a:b):c; 
		System.out.println(largest);
	}
}