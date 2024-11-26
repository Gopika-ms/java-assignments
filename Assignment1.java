// Assignment 1:Call the static method 5 times in the main method

package java_assignments;

public class Assignment1 
{
	static void Addition()
	{
		System.out.println("Addition=a+b");
	}
	static void Substraction()
	{
		System.out.println("Substraction=a-b");
	}
	static void Multiplication()
	{
		System.out.println("Multiplication=a*b");
	}
	static void Division()
	{
		System.out.println("Division=a/b");
	}
	static void Percentage()
	{
		System.out.println("Percentage=a/b*100");
	}

	public static void main(String[] args) {
		
		System.out.println("Arithematic Operations");
		Addition();
		Substraction();
		Multiplication();
		Division();
		Percentage();	
	}

}
