//Assignment 14:Single level inheritance by using Static methods
package java_assignments;

class Parent 
{
	static void parent_method()
	{
	System.out.println("Inheriting parent class with Static Method");
	}
}
public class Assignment14 extends Parent
{

	public static void main(String[] args) 
	{
	 parent_method();

	}

}
