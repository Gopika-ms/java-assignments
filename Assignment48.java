/*Assignment 48
"WAP from the given string replace the space with underscore.
Example: String input= ""My name is Shyam"";"
*/
package java_assignments;

public class Assignment48 
{
	public static void main(String[] args) 
	{
		String name= "My name is Shyam";
		String s1 = name.replaceAll(" ", "_");
		System.out.println("Upadated Result -> " +s1);
	}
}
