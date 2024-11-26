//Assignment 17:WAP on non parameterized super calling statement (within multiple class)
package java_assignments;

class Grandparent_Class
{
	Grandparent_Class()
	{
	System.out.println("Calling Grand parent class");
	}
}
class Parent_Class extends Grandparent_Class
{
	Parent_Class()
	{
	super();
	System.out.println("Inheriting Grand parent class in parent class");
	}
}	
public class Assignment17 extends Parent_Class
{
	Assignment17()
	{
	super();
	System.out.println("Inheriting parent class in child class");
	}
	public static void main(String[] args) 
	{
		new Assignment17();

	}
}

