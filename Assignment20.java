//Assignment 20:WAP on Method Overriding
package java_assignments;

public class Assignment20 
{
	void add(int a)
	{
		System.out.println("Result - " + a);
	}
	void add(double a)
	{
		System.out.println("Result - " + a);
	}
	void add(double a,double b)
	{
		double result = a+b;
		System.out.println("Result of Sum1 - " + result);
	}
	void add(double a,int b)
	{
		double result = a+b;
		System.out.println("Result of Sum2 - " + result);
	}
	void add(int a,double b)
	{
		double result = a+b;
		System.out.println("Result of Sum3 - " + result);
	}
	void add(int a,int b)
	{
		int result = a+b;
		System.out.println("Result of Sum4 - " + result);
	}
	public static void main(String[] args) 
	{
		Assignment20 m1 = new Assignment20();
		m1.add(10);
		m1.add(20.20);
		m1.add(30.30, 40.40);
		m1.add(50.50, 60);
		m1.add(70, 80.80);
		m1.add(90, 10);
	}

}
