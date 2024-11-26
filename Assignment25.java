//Assignment 25: Write a program on reverse a string.
package java_assignments;

public class Assignment25 
{
	public static void main(String[] args) 
	{
		String input = "Gopika";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1= input.charAt(i);
			output=output+c1;
		}
		
		System.out.println("Reversed String -> "+ output);
		
	}

}
