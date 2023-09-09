package com.arraypractice;
import java.util.Scanner;
// WAP to count Even and Odd number Using function

/*public class CountEvenOdd {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i;
		int evenCount = 0, oddCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print("Enter the size of an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print("Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		evenCount = CountEven(a, Size);
		oddCount = CountOdd(a, Size);		
		System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
		System.out.println(" Total Number of Odd  Numbers in this Array = " + oddCount);

	}
	public static int CountEven(int [] a, int Size)
	{
		int i, evenCount = 0;
		System.out.print("\n List of Even Numbers in this Array are :");  
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i] +" ");
				evenCount++;
			}
		}
		return evenCount;
	}
	public static int CountOdd(int [] a, int Size)
	{
		int i, oddCount = 0;
		System.out.print("\n List of Odd Numbers in this Array are :");  
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] + " ");
				oddCount++;
			}
		}
		return oddCount;
	}
}*/


public class CountEvenOdd { 

	public static void main(String[] args) 
	{
		int Size;
		int evenCount = 0, oddCount = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print("Enter the elements of an Array  : ");
		for (int i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(int i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}		
		System.out.println("Even Numbers in this Array = " + evenCount);
		System.out.println("Odd  Numbers in this Array = " + oddCount);
	}
}
