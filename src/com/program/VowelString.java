package com.program;

public class VowelString {

	public static void main(String args[]) {
		String str="shlok kUmar mishra";
		int vowelCount=0;
		char[]chars=str.toLowerCase().toCharArray();
		for(char c:chars) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
		
	}
}
