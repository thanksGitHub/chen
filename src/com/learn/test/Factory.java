package com.learn.test;

public class Factory {
	public Biology getBiology(int number)
	{
		Biology biology=null;
		switch(number)
		{
		case 0:biology=new Wolf();break;
		case 1:biology=new Sheep();break;
		default :System.out.println("û�����������");break;
		}
		return biology;
		
	}

}
