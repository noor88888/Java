package com.duplicate;
public class NonRepeating_FirstUniqueNumber 
{
	static int firstNonRepeating()
    {
		int arr[] = {5,8,1,2,2,4,6};
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < n; j++)
            {
                if (i != j && arr[i] == arr[j])
                    break;
            }
            if (j == n)
            return arr[i];
        }
 
        return -1;
    }
    public static void main(String[] args)
    {
    	System.out.print(firstNonRepeating());
    }
}
