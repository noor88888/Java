package LargestNumber;
import java.util.*;
public class StoreArray
{
	public static void main(String[] args)
	{
		 int n, j = 0, k = 0;
	     Scanner s = new Scanner(System.in);
	     System.out.print("Enter no. of elements you want in array:");
	     n = s.nextInt();
	     int a[] = new int[n];
	     int odd[] = new int[n];
	     int even[] = new int[n];
	     System.out.println("Enter all the elements:");
	     for(int i = 0; i < n; i++)
	     {
	         a[i] = s.nextInt();
	        
	     }
	     for(int i = 0; i < n; i++)
	     {
	         
	         System.out.print(a[i]+",");
	     }
	     for(int i = 0; i < n; i++)
	     {
	         if(a[i] % 2 != 0)
	         {
	             odd[j] = a[i];
	             j++;
	         }
	         else
	         {
	             even[k] = a[i];
	             k++;
	         }
	     }
	     System.out.println("j"+j);
         System.out.println("k"+j);
	     System.out.print("Odd:");
	     if(j > 1)
	     {
	         for(int i = 0;i < (j-1); i++)
	         {
	             System.out.println(odd[i]+",");
	         }
	         System.out.print(odd[j-1]);
	     }
	     else
	     {
	         System.out.println("No number");
	     }
	     System.out.println("");
	     System.out.print("Even:");
	     if(k > 1)
	     {
	         for(int i = 0; i < (k-1); i++)
	         {
	             System.out.print(even[i]+",");
	         }
	     System.out.print(even[k-1]);
	     }
	     else
	     {
	         System.out.println("No number");
	     }
	     Arrays.sort(a);
	     System.out.println("Sorted array:"+Arrays.toString(a));
	     Arrays.sort(odd);
	     System.out.println("Sorted odd:"+Arrays.toString(odd));
	     Arrays.sort(even);
	     System.out.println("Sorted even:"+Arrays.toString(even));
	     
	     int oddsum=odd[j]+odd[j+1];
	     System.out.println("sum of odd:"+oddsum);
	     int evensum=even[k]+even[k+1];
	     System.out.println("sum of even"+evensum);
	}
}
