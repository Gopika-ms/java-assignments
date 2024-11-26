//Assignment 26:Write a program where to check the given strings are palindrome or not.
package java_assignments;

public class Assignment26 
{
	public static void main(String[] args) 
	{
		String input="MADAM";
		String output="";
		for (int i=input.length()-1;i>=0;i--)
		{
			char c1= input.charAt(i);
			output = output + c1;
			//System.out.println(output);
		}	
		if(input.equals(output))
		{
			System.out.println(input + " is a palindrome.");
		}
		else
		{
			System.out.println(input + " is not a palindrome.");
		}
	}
}
