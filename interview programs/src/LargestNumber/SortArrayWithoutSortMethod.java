package LargestNumber;
import java.util.*;
public class SortArrayWithoutSortMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		n=s.nextInt();
		int a[]=new int[n];
		 for (int i=0;i<a.length;i++)
		    {
		       a[i]=s.nextInt();
		    }
		    for(int i=0;i<a.length;i++)
		    {
		        System.out.println("Array is : "+a[i]);
		    }
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("sorted array"+a[i]);
		}
	}
}
