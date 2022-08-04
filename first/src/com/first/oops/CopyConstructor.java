package com.first.oops;

public class CopyConstructor {
	
	String name;
	int age;
	
	CopyConstructor(String name,int age){
		
		this.name=name;
		this.age=age;
		
	}
	CopyConstructor(CopyConstructor copy){
		name=copy.name;
		age=copy.age;
	}
	
	 void display(){
	      System.out.println("Name : "+name);
	      System.out.println("Age : "+age);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructor c=new CopyConstructor("virat",32);
		c.display();
		CopyConstructor copy=new CopyConstructor(c);
		copy.display();

	}

}
