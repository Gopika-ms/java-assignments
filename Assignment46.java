/* Assignment 46
"WAP to check from the  given string find the letter end with y or not. 
Example: String name= ""I'm a boy"";"*/

package java_assignments;

public class Assignment46 
{
	public static void main(String[] args) 
	{
		String name="I'm a boy";
		boolean b1=name.matches("(.*)y");
		System.out.println("string end with y -> " + b1);
	}
}
