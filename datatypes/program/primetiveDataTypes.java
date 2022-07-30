package com.datatypes.program;

import java.util.Scanner;

public class primetiveDataTypes {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		float f = scan.nextFloat();
		double d = scan.nextDouble();
		long l = scan.nextLong();
		short s = scan.nextShort();
		byte b = scan.nextByte();
		char c = scan.next().toCharArray()[2];
		boolean bo = scan.hasNext();
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
		System.out.println(bo);
	}
}
