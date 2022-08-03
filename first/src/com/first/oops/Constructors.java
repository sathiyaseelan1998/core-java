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
	Constructors(String name,int age,String email){
		
		System.out.println(name+"---"+age+"---"+email);
	}
	void get()
	{
		System.out.println("method calling...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors con=new Constructors();
		Constructors cons=new Constructors("dhoni",38);
		Constructors conss=new Constructors("dhoni",38,"dhoni@gmail.com");

		con.get();
		cons.get();
	}

}
