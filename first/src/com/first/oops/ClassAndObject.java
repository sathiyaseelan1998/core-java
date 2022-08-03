package com.first.oops;

public class ClassAndObject {
	
	String name;
	
	void show() {
		System.out.println(name);
	}
	
	public static void manin(String arg[]) {
		
		
		ClassAndObject obj=new ClassAndObject();
		obj.name="class and object";
		obj.show();
	}

}
