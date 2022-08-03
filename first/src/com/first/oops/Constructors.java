package com.first.oops;

public class Constructors  {

	Constructors()
	{
		System.out.println("default constructors");
	}
	Constructors(String name,int age){
		System.out.println("parameterized constructors");
		System.out.println(name+"---"+age);
	}
	void get()
	{
		System.out.println("method calling...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors con=new Constructors();
		Constructors cons=new Constructors("dhoni",38);
		con.get();
		cons.get();
	}

}
