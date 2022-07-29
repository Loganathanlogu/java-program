package com.Static.method.Example;

class logu{
	int phonenumber;//Instance variable
	String name;
	static String Home=("Sivanmalai");//static variable
	//constructor
	logu(int p,String n ){
		phonenumber=p;
		name=n;
	}
	//method to display the values
	void display() {
		System.out.println(phonenumber+"  "+name+"  "+Home);
	}
}

public class StaticMethodExample {
	

	public static void main(String[] args) {
		logu ex1 = new logu(908019662,"Loganathan");
	    logu ex2 = new logu(975677726,"Senthil kumar");
		ex1.display();
		ex2.display();	

	}

}

