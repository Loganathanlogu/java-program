package com.array.program;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		
		int[] s ={2,44,3,55,6,77,88,99,33,22};
		 
		Arrays.sort(s);//method
		System.out.println("Array of ascending order:");
		for(int i=0;i<s.length;i++)//small to large
		{
			System.out.println(s[i]+" ");
		}
	 
		System.out.println("Array of deascending order:");

		for(int j=s.length-1;j>=0;j--) //large to small
		{
			System.out.print(s[j]+" ");
		}
	}

}
