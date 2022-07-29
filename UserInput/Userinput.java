package com.UserInput;

import java.util.Scanner;

public class Userinput {


	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Username:");
		String name=scan.nextLine();
		double x=scan.nextDouble();
		int d=scan.nextInt();
		char c=scan.next().toCharArray()[2];
		System.out.println(name);
		System.out.println(x+d);
		System.out.println(c);
	}
}
