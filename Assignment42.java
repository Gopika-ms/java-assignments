/* Assignment 42
WAP from the given string input replace all the Capital letters with Nothing.
Example: String name= ""I am The Boss""; */

package java_assignments;

public class Assignment42 
{
	public static void main(String[] args) 
	{
		String name="I am The Boss";
		String s1 =name.replaceAll("[A-Z]", "");
		System.out.println("Upadated Result -> " +s1);
	}
}
