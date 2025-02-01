
abstract class Sports
{
	abstract void display();
}
class Football extends Sports
{
	void display()
	{
		System.out.println("hii this is football");
	}
}

class Basketball extends Sports
{
	void display()
	{
		System.out.println("hii this is basketball");
	}
}

class Rugby extends Sports
{
	void display()
	{
		System.out.println("hii this is rugby");
	}
}
class Sportdis 
{
 public static void main(String args[])
	{
		 Sports f = new Football();
	     Sports b = new Basketball();
	     Sports r = new Rugby();
	     f.display();
	     b.display();
	     r.display();
	        
		
	}
}