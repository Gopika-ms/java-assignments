//Assignment 75:WAP using this keyword
package java_assignments;

public class Assignment75 
{
	Assignment75(int a)
	{
		System.out.println("Constructor with parameter");
	}
	Assignment75()
	{
		this(100);
		System.out.println("Constructor without parameter");
	}
	public static void main(String[] args) 
	{
		Assignment75 a75 = new Assignment75();

	}

}
