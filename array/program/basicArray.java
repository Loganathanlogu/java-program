package com.array.program;

public class basicArray {

	public static void main(String[] args) {
		//int[] n = new int[5];//declaration
	
		int[] n = {2,3,4,5,6,7};//Initialization
	
		String[] name = new String[5];
		name[0] = "Logu";
		name[1] = "Dheena";
		name[2] = "Kamal";
		name[3] = "madhu";
		name[4] = "Ajith";
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}

		System.out.println("Print specific value:"+name[0]);
		System.out.println("print specific value:"+ n[3]);
		
	}
	

}
