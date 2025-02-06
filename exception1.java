package com.mphasis.Javaprograms;



/*class exception1
{
	public static void main(String args[])
	{
		int a=20,b=0,c=0;
		try
		{
			c=a/b;
			System.out.println("division is:"+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("excep");
		}
		System.out.println("good");
	}
}*/

public class exception1 extends Exception
{
	public exception1(String str)
	{
		super(str);
	}
}