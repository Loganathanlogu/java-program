package com.Test1.program;

import java.util.Scanner;

public class countvalue {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name =in.nextLine();
		char[] ch=name.toCharArray();
	  int n=ch.length;//loganathan
	   
	    for(int i=0;i<n;i++) {
	    	int count=0;
	    	for(int j=0;j<n;j++) {
	    		
	    		if(ch[i]==ch[j]) {
	    			count++;
	    		}
	    		
	 
	    		 System.out.println("The count of "+ ch[i] +" is: "+ count);
	    		
	    	}
	  
	    }
	   
		
		
		
	}

}
