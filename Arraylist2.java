package com.mphasis.Javaprograms;
import java.util.ArrayList;

import java.util.ListIterator;
import java.util.Scanner;

public class Arraylist2{
public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println("Original List: " + a);
		
		ListIterator<Integer> l=a.listIterator();
		
		while(l.hasNext())
		{
			int aa=l.next();
			if(aa%2==0)
			{
				l.remove();
			}
			else
			{
				continue;
			}
		}
		System.out.println("list after removing:"+a);
		sc.close();
	}}