package com.Test1.program;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		//Anagram program
		
		Scanner in = new Scanner(System.in);
		
		String name1=in.nextLine();
		String name2=in.nextLine();
	
		
		Arrays.sort(name1.toCharArray());
		Arrays.sort(name2.toCharArray());
		if(name1.length()==name2.length()) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
				
		
		
			
		

	

}
	}