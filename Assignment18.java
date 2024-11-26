//Assignment 18: WAP on parameterized super calling statement (within multiple class)"
package java_assignments;

class Grandparent_Class1
{
	Grandparent_Class1(int a, int b)
	{
	System.out.println("Calling Grand parent class with parameterized method");
	}
}
class Parent_Class1 extends Grandparent_Class1
{
	Parent_Class1()
	{
	super(2,4);
	System.out.println("Inheriting Grand parent class in parent class");
	}
}	
public class Assignment18 extends Parent_Class1
{
	Assignment18()
	{
	super();
	System.out.println("Inheriting parent class in child class");
	}
	public static void main(String[] args) 
	{
		new Assignment18();

	}

}
