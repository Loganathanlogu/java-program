package com.array.program;

public class DuplicatArray {

	public static void main(String[] args) {
	

		int[] dup = {2,3,4,5,4,6,8,9,55,5};
		
		for(int i=0;i<dup.length;i++) {
			for(int j=1+i;j<dup.length;j++) {
				if(dup[i]==dup[j])
					System.out.println(dup[j]);
			}
		}
	}

}
