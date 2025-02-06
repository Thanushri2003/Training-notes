package com.mphasis.Javaprograms;

class Test {
    synchronized void print(String name,int n) {
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println(i*n);             
    	}
        System.out.println("HIIII " + name);
        try {
            Thread.sleep(400);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Main1 extends Thread {
    Test t1;

    Main1(Test t)
    {
        this.t1 = t;
    }

    public void run() 
    {
        t1.print(Thread.currentThread().getName(),5);
    }
}

class Main2 extends Thread {
    Test t2;

    Main2(Test t) {
        this.t2 = t;
    }

    public void run() 
    {
        t2.print(Thread.currentThread().getName(),5);
    }
}

class thread2 {
    public static void main(String args[]) {
        Test t = new Test();
        Main1 m1 = new Main1(t);
        Main2 m2 = new Main2(t);

        m1.start(); 
        m2.start(); 
    }
}
