package LargestNumber;
import java.util.*;
public class SumOfLargeNum //THIS WORK WELL IN ONLINE COMPILER
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter value of n");
		int n=scan.nextInt();
		int a[]=new int [n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter array "+i+" value :");
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("student "+i+" marks "+a[i]);
		}
		Arrays.sort(a);//this sorts in assending order
		System.out.println(Arrays.toString(a));  
        int sum =a[n-1]+a[n-2];
        System.out.println("Sum of two largest numbers in an array :"+sum);
	}
}
