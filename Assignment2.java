//Assignment 2:Operators(+,-,*,/,%) using non_static method

package java_assignments;

public class Assignment2 
{
	static int a=100;
	static int b=200;
	void add()
	{
		System.out.println("Addition Result -> "+ (a+b));
	}
	
	void sub()
	{
		System.out.println("Subtraction Result -> " + (a-b));
	}
	void mul()
	{
		System.out.println("Multiplication Result -> " +(a*b));
	}
	void div()
	{
		System.out.println("Division Result -> " +(b/a));
	}
	void mod()
	{
		System.out.println("Modulus Result -> " +(a%b));
	}
	
	public static void main(String[] args) 
	{
		Assignment2 a2 = new Assignment2();
		a2.add();
		a2.sub();
		a2.mul();
		a2.div();
		a2.mod();
	}	

}
