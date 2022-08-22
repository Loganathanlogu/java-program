package com.Test1.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	//palindrome and Reverse
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println("Before Reverse:");
		System.out.println(name);
		
	
		System.out.println("AfterReverse:");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
			
			
		}
		
	}

}
