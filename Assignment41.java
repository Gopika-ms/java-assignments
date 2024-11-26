/*Assignment 41
WAP from the given string input replace all the alphabets with Nothing.
Example: String name= ""kv no 2"";*/

package java_assignments;

public class Assignment41 
{
	public static void main(String[] args) 
	{
		String name= "kv no 2";
		String s1 = name.replaceAll("[a-z]", "");
		System.out.println("Upadated Result -> " +s1);
	}
}
