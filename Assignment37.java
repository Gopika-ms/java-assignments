//Assignment 37: WAP to compare the String by using the method equalIgnoreCase.
package java_assignments;

public class Assignment37 
{
	public static void main(String[] args) 
	{
		String input1 = "GratefuL";
		String input2 = "grAteFul";
		boolean b1=	input1.equalsIgnoreCase(input2);
		System.out.println("Check if the 2 strings are same without considering case -> " + b1);
	}
}
