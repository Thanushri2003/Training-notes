package com.mphasis.Javaprograms;
import java.util.*;
public class excep1 
{
	static float percentage(int m1,int m2,int m3)
	{
		float per;
		per=((m1+m2+m3)/300.0f)*100;
		return per;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int q1=sc.nextInt();
		int q2=sc.nextInt();
		int q3=sc.nextInt();
		
		try
		{
			float ans=percentage(q1,q2,q3);
			if(ans<50)
			{
				throw new exception1("Fail");
			}
			else {
                System.out.println("Pass: Percentage is " + ans + "%");
            }
		}
		catch(exception1 ex)
		{
			System.out.println(ex.getMessage());
		}
		finally {
            sc.close();
        }
		
	}
	
	
}

