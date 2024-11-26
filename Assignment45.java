/*Assignment 45
"WAP to check from the  given string find the letter start with capital M
 or not. Example: String name= ""My name is Ram"";"*/
package java_assignments;

public class Assignment45 
{
	public static void main(String[] args) 
	{
		String name="My name is Ram";
		boolean b1=name.matches("M(.*)");
		System.out.println("string start with capital M -> " + b1);
	}
}
