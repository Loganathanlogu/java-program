package com.array.program;

import java.util.Arrays;
import java.util.Scanner;

public class UserinputArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] no = new int[length];
		
		for(int i=0;i<length;i++) {
			no[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(no));

	}

}
