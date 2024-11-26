//Assignment 59:WAP to convert any String into array
package java_assignments;

import java.util.Arrays;

public class Assignment59 
{
	public static void main(String[] args) 
	{
		String s1 = "Gopika";
		char[] c1= s1.toCharArray();
		System.out.println("Display String in Array format ->" + Arrays.toString(c1));
	}
}
