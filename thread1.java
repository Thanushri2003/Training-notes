package com.mphasis.Javaprograms;

public class thread1 extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread "+Thread.currentThread().getName()+":"+i);
		}
	}
	
	public static void main(String args[])
	{

		thread1 t1=new thread1();
		thread1 t2=new thread1();
		t1.start();
		t2.start();
	}
}

