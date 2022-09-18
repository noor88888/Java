package com.array_related_programs;
import java.util.*;
class Prime
{
	void prime_number()
	{
	int temp, num;
    boolean isPrime = true;
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    in.close();
    for (int i = 2; i<= num/2; i++)
    {
        temp = num%i;
        if (temp == 0)
        {
            isPrime = false;
            break;
        }
    }
    if(isPrime) 
        System.out.println(num + "number is prime");
        else
        System.out.println(num + "number is not a prime");
	}		
}