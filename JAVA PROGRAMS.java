/1.Write a Java program to perform basic Calculator operations.
package com.test;

import java.util.Scanner;


public class Operation {
	
	public int addition(int a, int b) {
		int add=a+b;
		return add;
		
	}
	public int substraction(int a, int b) {
		int sub=a-b;
		return sub;
	}
	public int multiplication(int a, int b) {
		int mul=a*b;
		return mul;
	}
	public int division(int a, int b) {
		int div=a/b;
		return div;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number -" );
		int a=sc.nextInt();
		System.out.println("Enter the Second number -");
		int b=sc.nextInt();
		
		Operation operation=new Operation();
		int num1=operation.addition(a, b);
		int num2=operation.substraction(a, b);
		int num3=operation.multiplication(a, b);
		int num4=operation.division(a, b);
		
		System.out.println(" The addition is :" +num1);
		System.out.println(" The substraction is :" +num2);
		System.out.println(" The multiplication is :" +num3);
		System.out.println(" The division is :" +num4);
		
		
	}
	
	

}

/2.Write a Java program to calculate Fibonacci Series up to n numbers.
package com.example;

import java.util.Scanner;

public class Fabonacci {
	
	 
	
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int res=0;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
	    int n=sc.nextInt();
	    System.out.println("Number in series are:" +n1);
	    System.out.println("Number in series are:" +n2);
	    while(i<=n) {
	    	res=n1+n2;
	    	n1=n2;
	    	n2=res;
	    	i++;
	    	 System.out.println("Number in series are:" +res);
	    	
	    }
	    
	}

}

/3.Write a Java program to calculate a Factorial of a number.
package com.test;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String[] args) {
		
		int fact=1;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
		
			fact=fact*i;
			
			
		}
		System.out.println("The factorial of number is :" +fact);
	}

}

/4.Write a Java program to find out whether the given String is 
Palindrome or not.
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StringBuilder input=new StringBuilder();
		
		StringBuilder t=input.append(sc.next());
	    System.out.println(t);
	    
	    StringBuilder s=t.reverse();
	    System.out.println(s);
	    
	    if(s.compareTo(t)==0) {
	    	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not Palindrome");
	    }
	}

}
5.Write a Java program to calculate Permutation and Combination of 2 numbers.
package SimpleNumberPrograms;

import java.util.Scanner;

public class Permutations {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int n, r, NCR, NPR;
		
		System.out.print("Please Enter n Value = ");
		n = sc.nextInt();
		System.out.print("Please Enter r Value = ");
		r = sc.nextInt();
		
		NCR = fact(n)/(fact(n - r) * fact(r));
		NPR = fact(n)/fact(n - r);
		
		System.out.println("NCR Value = " + NCR);
		System.out.println("NPR Value = " + NPR);
	}
	
	public static int fact(int number) {
		if(number == 0 || number == 1) {
			return 1;
		}
		else {
			return number * fact(number - 1);
		}
	}
}
6.Write a program in Java to print Diamond Pattern.
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
				
			}
			
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
}


7.Write a Java Program to reverse the letters present in the given String.
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String text=sc.nextLine();
         char [] character=text.toCharArray(); 
         for(int i=character.length-1;i>=0;i--) {
        	 System.out.print(character[i]);
         }
	}

}
8.Write a Java Program to check whether the given array is Mirror Inverse or not.
import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		int t=0;
		int k=0;
		
		
		for(int i=0 ;i<num ;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0 ;i<num ;i++) {
			//System.out.print(arr[i]+ "  ");
			t=arr[i];
			System.out.print(t+ "  ");
			
		}
	
		int inver;
		int start=0;
		int end=num-1;
		while(start<end) {
			inver=arr[start];
			arr[start]=arr[end];
			arr[end]=inver;
			
			start++;
			end--;
		}
	
		System.out.println();
		for(int j=0;j<num;j++) {
			//System.out.print(arr[j]+ "  ");
			k=arr[j];
			System.out.print(k+ "  ");
		}
		System.out.println();
		if(k==t) {
			System.out.println("Inverse");
		}
		else {
			System.out.println("Not Inverse");
		}
	}
}

9.Write a Java program to remove elements from an ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class Arrayli {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++) {
			arr.add(i);
		}
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
	}
}
10.Write a Java Program to find the Transpose of a given Matrix.
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of coloumn:");
		int col=sc.nextInt();
		
		int[][] mat=new int[rows][col];
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
	
            for(int i=0;i<rows;i++) {
			
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+ " ");
				
			}
		
			
			System.out.println();
         }
	
            System.out.println("The transpose of given matrix is:");
          for(int i=0;i<col;i++) {
        	  
        	  for(int j=0;j<rows;j++) {
        		  
        		  System.out.print( mat[j][i]+ " ");
        	  }
        	  System.out.println();
          }
	}
}

