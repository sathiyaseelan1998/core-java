package com.first;

public class Variables {
	
	String instance="instance variable";
	static String statics="static variable";
	public void show()
	{
		System.out.println("INSTANCE="+instance);
	}
	
	public static void display()
	{
		System.out.println("STATIC="+statics);

	}
	public static void main(String[] args) {
		
		String local="local variable";
		System.out.println("LOCAL="+local);

		Variables v=new Variables();
		v.show();
		display();
		
	}

}
