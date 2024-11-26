package java_assignments;

public class Assignment4 
{
	void add() 
	{
		int a=200;
		int b=200;
		System.out.println("Addition Result1 -> "+ (a+b));
	}
	void add(int a,int b) 
	{
		System.out.println("Addition Result2 -> "+ (a+b));
	}
	void add(double a,int b) 
	{
		System.out.println("Addition Result3 -> "+ (a+b));
	}
	void add(int a,double b) 
	{
		System.out.println("Addition Result4 -> "+ (a+b));
	}
	void add(double a,double b) 
	{
		System.out.println("Addition Result5 -> "+ (a+b));
	}
	public static void main(String[] args) 
	{
		Assignment4 a4= new Assignment4();
		a4.add();
		a4.add(8,4);
		a4.add(2.2,5);
		a4.add(3.5,2);
		a4.add(1.5,4.5);
	}
}
