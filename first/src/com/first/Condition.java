package com.first;

public class Condition {

	public static void main(String[] args) {
		
//<<<<<<< HEAD
		int mark=23;
		
		if(mark>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		/*
		 * ======= System.out.println("if-else"); >>>>>>> branch 'master' of
		 * https://github.com/sathiyaseelan1998/core-java.git
		 * 
		 */
		System.out.println("========if else-if==========");
		
		if(mark>90)
		{
			System.out.println("A grade");

		}
		else if(mark>70)
		{
			System.out.println("B grade");

		}
		else if(mark>40)
		{
			System.out.println("C grade");

		}
		else
		{
			System.out.println("fail");

		}
		
		}
}
