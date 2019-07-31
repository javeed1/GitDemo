package com.javaInterview;

public class SumPairs {
	
	static int Pairs(int a[], int k)
	{
		
		int count =0;
		int i =0;
		while(i<a.length)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]+a[i] == k)
						{
					count++;
					
						}
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	 {
	     int arr[] = {6,6,3,9,3,5,1};  //  1,3,3,5,6,6,9
	     int k = 12;
	     int n = arr.length;
	    // System.out.println(maxSum(arr, n, k));
	    System.out.println(Pairs(arr, k));
	 }

}
