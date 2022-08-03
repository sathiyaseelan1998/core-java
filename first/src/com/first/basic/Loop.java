package com.first.basic;

public class Loop {
	
	public static void main(String[] args) {
		
		System.out.println("=====for loop=====");
		
		int i;
		int j=1;
		int k=1;
		
		  for(i=1;i<=10;i++) {
			  
			  System.out.println(i);
		  
		  }
		  
		  System.out.println("=====while loop=====");
		 
		while(j<=10)
		{
			System.out.println(j);
			j++;

		}
		
		System.out.println("=====do-while loop=====");

		 do {
			 
			 System.out.println(k); k++; 
			 
		 } 
		 
		 while(k<=10);
		 
		
	}

}
