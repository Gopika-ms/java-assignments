/*Assignment 43
"WAP from the given string input replace all the entire numerics with Nothing.
Example: String name= ""My home is near to sector 2 Patna 4"";"*/
package java_assignments;

public class Assignment43 
{
	public static void main(String[] args) 
	{
String name= "My home is near to sector 2 Patna 4";
		String s1 =name.replaceAll("[A0-9]", "");
		System.out.println("Upadated Result -> " +s1);
	}
}
