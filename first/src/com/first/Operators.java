package com.first;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1=900;
		int m2=1000;
		int m3=700;
		System.out.println("======ARITHMATIC OPERATOR======");
		System.out.println(m1+m2);
		System.out.println(m1-m2);
		System.out.println(m1*m2);
		System.out.println(m1/m3);
		System.out.println(m1%m2);
		
		System.out.println("===== LOGICAL OPERATOR======");
		System.out.println(m1<m2 && m2>m3);
		System.out.println(m1>m2 || m2>m3);
		System.out.println(m1>m2 || m1<m3);
		
		System.out.println("===== ASSIGNMENT OPERATOR======");
		m1+=35;
		m2-=2;
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println("===== UNARY OPERATOR======");

		System.out.println(++m1);
		System.out.println(--m2);
//>>>>>>> branch 'master' of https://github.com/sathiyaseelan1998/core-java.git
		
		
	}

}
