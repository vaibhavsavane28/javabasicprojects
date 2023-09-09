package com.arraypractice;
// Different way to print Array

public class ArrayPractice{
	public static void main(String[]args)
	{
		int a[]= {1,2,3,4,5};
		
		//1.method using for
		System.out.println("Using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(" "+a[i]);
		}
		//2.method using for each
		
		for(int i:a)
		{
			System.out.println(i);  // *important
		}
		
		//3.using object toString method
		System.out.println("using object toString method");
		System.out.println(Arrays.toString (a));
	
	//4. method foreach Stream java
	System.out.println("method foreach Stream java");
	Array.Stream(a).forEach(System out ::println);                                                                                    
	
		
	}
}
// All in one program - Odd-Even,Adition,Min-Max number,Number present in array
/*import java.util.*; 
public class ArrayPractice {
	int [] input() {
	int size ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an Array: ");
	size = sc.nextInt();
	
	int []marks = new int [size];
	 System.out.println("Enter Elements in an Array: ");
	 
	 	for(int i=0 ; i<marks.length ; i++) {
		 marks [i] = sc.nextInt(); 
	 	}
	 	return marks;
		 	 
	}
	
	void display(int [] marks) {
		for(int ele : marks) {
			System.out.println("The elements present in the array: " + ele);
		}	
	}
	
	 void find_even (int [] marks) {
		 int odd = 0 , even = 0 ;
		  for(int ele : marks) {
			  if (ele % 2 == 0) { 
				  even ++ ;
			  }
			  else {
				  odd ++ ;
			  }	  
		  }
		  System.out.println("\nEven numbers are: " + even );
		  System.out.println("Odd numbers are: " + odd );
	 }
	 
	  int [] even_odd_sum (int [] marks){
		 int sum_even = 0 , sum_odd = 0 ;
		 for(int ele : marks) {
			  if (ele % 2 == 0) { 
				  sum_even = sum_even + ele ;
			  }
			  else if (ele!=2) {
				  sum_odd = sum_odd + ele ;
			  }	  
		 }
		 return new int[]{sum_even, sum_odd };		 
	 }
	  
	  int [] min_max (int [] marks) {
		  int max = Integer.MIN_VALUE;
		  int min = Integer.MAX_VALUE;
		  for(int ele : marks) {
			  if (ele > max) {
				  max = ele ;
			  }
			  if (ele< min) {
				  min = ele ;
			  }
		  }	
		  return new int[]{max, min }; 
	  }
	  int input1 () {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("\nEnter the nmber that you want to find: ");
		  int num = sc.nextInt();
		  return num;
	  }

	  void check (int [] marks,int num) 
	  {
		
	  
		  boolean isPresent = false;
		  for(int ele : marks) {
			  if (num == ele) 
			  {
				  isPresent = true;
				  break;
			  }
		  }	
	  
		  if (isPresent) {
				System.out.println("The number is present");
		  } 
		  else if (isPresent != true){ 
				System.out.println("The number is not present");
		  }
//		  return new boolean [] {isPresent};
	  }

	public static void main(String[] args) {
		ArrayPractice ob = new ArrayPractice ();
		int [] marks = ob.input();
		ob.display(marks);
		ob.find_even(marks);
		int [] sum = ob.even_odd_sum(marks);
		System.out.println("\nAddition of even numbers are: " + sum[0]);
		System.out.println("Addition of odd numbers are: " +sum[1]);

		//		ob.even_odd_sum(marks[0,1);
		int [] maxmin = ob.min_max(marks);	
		System.out.println("\nMaximum number is: " + maxmin[0]);
		System.out.println("Minimum numbers is: " + maxmin[1]);
		
		
		int num = ob.input1();
		ob.check(marks,num);
		
		
	}
}
*/		
		