package com.array.program;

import java.util.Arrays;

public class LargenumberOfArray {

	public static void main(String[] args) {
		
		int[] large={3,4,233,5,66,77,8,7,88,99,234,235};
		int max = large[0];	
		int small=large[0];
		
		for(int i=0;i<large.length;i++) {
		
			if(large[i]>max) 
			
			max=large[i];
		}
		System.out.println("largest element in the array is:" +max);
		

	for(int i=0;i<large.length;i++) {
	
		if(large[i]<small) 
		
		small=large[i];
	}
	System.out.println("Smallest element in the array is:" +small);
	}
	
	
 	}



