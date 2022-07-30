package com.Constructor;

public class ParameterizedConstructor {
	String name;
	int age;
	double DOB;
	//creating parameterized  constructor
	ParameterizedConstructor(String n, int a, double d ){
		name = n;
		age = a;
	    DOB = d;

	}
	void logu() {
		System.out.println("Name:"+name+"  "+"Age:"+" "+age+" "+"DOB:"+DOB);
	}
	

	public static void main(String[] args) {
		 ParameterizedConstructor pc = new  ParameterizedConstructor("logu",22,26.12);//calling constructor
		pc.logu();

	}

}
