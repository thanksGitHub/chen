package com.learn.test;

public class Test {
	public static void main(String []args)
	{
		Factory factory=new Factory();
		java.util.Random a=new java.util.Random ();
		for(int i=0;i<20;i++)
		{
			
			Biology biology=factory.getBiology(a.nextInt(2));
			biology.speak();
			
		}
		
		
	}

}
