package com.program;

import java.util.Scanner;

public class SwapTwo {
// Swap To Number Without Using The Number
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The First Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Original FirstNumber"+firstNumber);
		
		System.out.println("Enter The Second Number");
		int secondNumber=scanner.nextInt();
		System.out.println("Original Second Number");
		
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		System.out.println("After Swaapping Number..........");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
}
