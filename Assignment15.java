//Assignment 15:Single level inheritance by using Non Static methods
package java_assignments;
 
class Parent_NonStatic 
{
	void parent_method()
	{
	System.out.println("Inheriting parent class with Non-Static Method");
	}
}
public class Assignment15 extends Parent_NonStatic
{

	public static void main(String[] args) 
	{
		Assignment15 a1= new Assignment15();
		a1.parent_method();

	}

}

