package com.program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String string=scanner.nextLine();
		System.out.println("Original String"+string);
		String revers=" ";
		int len=string.length()-1;
		for(int i=len;i>0;i--) {
			revers=revers+string.charAt(i);
		}
		System.out.println("Reverse String"+revers);
	}
}
