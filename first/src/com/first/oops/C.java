package com.first.oops;

public class C extends A {
	void c() {
		System.out.println("sub class of class A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		B b=new B();
		b.b();
		b.a();
		c.c();
		c.a();
		
	}

}
