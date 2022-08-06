package com.first.oops;

import java.util.Scanner;

public class Scanners {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		name=sc.nextLine();
		System.out.println("enter your age");
		age=sc.nextInt();
		
		System.out.println(name+"---------"+age);

		



	}

}
