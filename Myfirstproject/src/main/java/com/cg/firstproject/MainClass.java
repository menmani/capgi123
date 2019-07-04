package com.cg.firstproject;

import com.cg.firstproject.SalesClass;

public class MainClass 
{
	public static void main(String[] args)
	{
		System.out.println("welcome! Sales Application!");
		SalesClass obj=new SalesClass();
		obj.show();
		display();
	}
	public static void display()
	{
		System.out.println("Hello!");
	}

}
