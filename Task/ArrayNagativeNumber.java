package com.Task;

import java.util.Arrays;

public class ArrayNagativeNumber {

	public static void main(String[] args) {
		int[] num= {2,-3,4,-5,6,-7,9,-8};
		int j=0,temp;
		for(int i=0;i<num.length;i++) {
			if(num[i]<0) {
				if(i!=j) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				j++;
			}
			
		}
		System.out.println(Arrays.toString(num));
	

	}

}
