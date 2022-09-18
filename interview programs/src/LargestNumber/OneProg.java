package LargestNumber;
import java.util.*;
public class OneProg 
{	
	 public static void main(String []args)
     {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();   
        int arr[]=new int[n];
        System.out.println("Enter the array");  
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is :");
        for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
        System.out.println("");
        int evenSize=0,oddSize=0;    //Declare the size of the array for even and odd elements
        for(int i=0;i<n;i++)   
        {
            if(arr[i]%2==0)
             evenSize++;    //Increment even array size
             else 
             oddSize++;   //Increment odd array size
        }
        int even[]=new int[evenSize];    //Declare an even array
        int odd[]=new int[oddSize];   //Declare an odd array
        
        int k=0,t=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
              even[k]=arr[i];   //Initialize elements of even array
              k++;
            }
            else
            {
                odd[t]=arr[i];  //Initialize elements of odd array
                t++;
            }
        }
        
        System.out.println("The array with even elements...");
        for(int i=0;i<evenSize;i++)
        {
            System.out.print(even[i]+" ");   //Print Even Array
        }
        System.out.println("");
        System.out.println("The array with odd elements...");
        for(int i=0;i<oddSize;i++)
        {
            System.out.print(odd[i]+" ");    //Print Odd Array
        }
        System.out.println("");
        System.out.println("The array elements...");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("   ");
        Arrays.sort(arr);
		System.out.println("Sorted Array :"+Arrays.toString(arr));
		System.out.println("   ");
		System.out.println("Largest Number"+":"+arr[n-1]);
		System.out.println("Smallest Number"+":"+arr[0]);
		System.out.println("   ");
		
		int SumOfLargestNumbers=arr[n-1]+arr[n-2];
		System.out.println("Sum of largest numbers :"+ SumOfLargestNumbers);
		int SumOfLowestNumbers=arr[0]+arr[1];
		System.out.println("Sum of lowest numbers :"+ SumOfLowestNumbers);
        System.out.println("   ");
        
        Arrays.sort(even);
		System.out.println("Sorted even Array :"+Arrays.toString(even));
		System.out.println("   ");
        System.out.println("Largest Even Number"+":"+even[evenSize-1]);
		System.out.println("Smallest Even Number"+":"+even[0]);
		System.out.println("   ");
		
		Arrays.sort(odd);
		System.out.println("Sorted odd Array :"+Arrays.toString(odd));
		System.out.println("   ");
		System.out.println("Largest odd Number"+":"+odd[oddSize-1]);
		System.out.println("Smallest odd Number"+":"+odd[0]);
    }
}
