package com.operators;

public class unaryOperator {

	public static void main(String[] args) {
		int sub = 25;
		int sub1 = 22;
		int b=44;
		boolean c=true;
		System.out.println("postfix value:");
		System.out.println(sub++);//25(26)
		System.out.println(++sub);//26+1=27
		System.out.println("prefix value:");
		System.out.println(sub1--);//22(21)
		System.out.println(--sub1);//20
		System.out.println(~b);
		System.out.println(!c);
	}

}
