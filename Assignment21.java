//Assignment 21:WAP on Method Overriding using super keyword in java
package java_assignments;

class University2
{
	University2()
	{
	System.out.println("Calling University class");
	}
}
class Student1 extends University2
{
	Student1()
	{
	super();
	System.out.println("Inheriting University class in Student class");
	}
}	
public class Assignment21 extends Student1
{
	Assignment21()
	{
	super();
	System.out.println("Inheriting student class in assignment21 class");
	}
	public static void main(String[] args) 
	{
		new Assignment21();

	}
}