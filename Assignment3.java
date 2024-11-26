//Assignment 3:Operators with static method by using method overloading concepts
 
package java_assignments;

public class Assignment3 
{
	static void add() 
	{
		int a=100;
		int b=200;
		System.out.println("Addition Result1 -> "+ (a+b));
	}
	static void add(int a,int b) 
	{
		System.out.println("Addition Result2 -> "+ (a+b));
	}
	static void add(double a,int b) 
	{
		System.out.println("Addition Result3 -> "+ (a+b));
	}
	static void add(int a,double b) 
	{
		System.out.println("Addition Result4 -> "+ (a+b));
	}
	static void add(double a,double b) 
	{
		System.out.println("Addition Result5 -> "+ (a+b));
	}
	public static void main(String[] args) 
	{
		add();
		add(8,4);
		add(2.2,5);
		add(3.5,2);
		add(1.5,4.5);
	}
	
}
