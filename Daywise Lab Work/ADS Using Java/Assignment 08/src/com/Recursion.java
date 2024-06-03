package com;

//1. Read a number from user the find the sum of digits of the number using recursive function.
public class Recursion {

	public static void main(String[] args) {

		System.out.println(sumOfDigits(3455));
		System.out.println(squareOf(16));
		System.out.println(factorialTailRecursive(5, 1));
		System.out.println(checkPal(121));
	}
	
	//1. Read a number from user the find the sum of digits of the number using recursive function.
	private static int sumOfDigits(int i) {

		if(i<=0) {
			return i;
		}
		
		int sums = sumOfDigits(i/10)+i%10;
		return sums;	
	}
	
	//2. Write a recursive function to find the square of the number.
	private static int squareOf(int i) {
		if( i == 1 || i==0) {
			return i;
		}
		return i+squareOf(i-1) + i-1 ; //
	}
	
	//3.Write a program to demonstrate the tail recursion for finding the factorial of the number.
	
	private static int factorialTailRecursive(int n, int f) {
		
		if(n==1 ) {
			return f;
		}
		else {
			return factorialTailRecursive(n-1, n*f);
		}
		
	}
	
	//4. Write a method to check whether the number is palindrome or not
	static int num1=0;
	private static boolean checkPal(int n) {
				
			return (n== revnum(n));
	}
	private static int revnum(int n) {
		if(n==0) {
			System.out.println(num1);
			return num1;
		}
		int r;
		r=(n%10);
		num1=num1*10+r; 
		n=n/10;
		
		 revnum(n);
		 return num1;
	}
	
}
