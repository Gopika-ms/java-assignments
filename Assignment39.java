//Assignment 39: WAP where from the given string replace the City name Gurgaon to Delhi. Example: String name= ""I'm in Gurgaon"";
package java_assignments;

public class Assignment39 
{
	public static void main(String[] args)
	{
		String name= "I'm in Gurgaon";
		String s1=name.replaceAll("Gurgaon", "Delhi");
		System.out.println("Updated result -> " + s1);
	}
}
