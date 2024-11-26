/*Assignment 47
"WAP to check from the  given string find the letter ""s"" is present or not. 
Example: String input= "" I'm a simple boy"";"*/
package java_assignments;

public class Assignment47 
{
	public static void main(String[] args) 
	{
		String name="I'm a simple boy";
		boolean b1=name.matches("(.*)s(.*)");
		System.out.println("string has letter 's' -> " + b1);
	}
}
