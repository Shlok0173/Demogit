package com.program;

import java.util.Scanner;

public class PrimeNumber {
// Given Number Are PrimeNumber
	public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The Number");
    int num=scanner.nextInt();
    int count=0;
    for(int i=1;i<=num;i++) {
    	if(num%i==0) {
    		count++;
    	}
    //	System.out.println("Count Prime Number"+count);
    }
    System.out.println(count);
     if(count==2) {
    	 System.out.println("PrimeNumber");
     }else {
    	 System.out.println("Not Prime Number");
     }
}
}