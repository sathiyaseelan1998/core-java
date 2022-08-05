package com.first.basic;


public class Returns {
	
	public int add(int a,int b) {
		return a+b;
		
	}
	public String info(String name) {
		return name;
		
	}
	public float division(float a,float b) {
		return a/b;
		
	}
	
public static void main(String arg[]) {
	Returns r=new Returns();
	System.out.println(r.add(100,400));
	System.out.println(r.info("rohit"));
	System.out.println(r.division(50,35));
	}

}
