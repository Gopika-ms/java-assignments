//Assignment 35:WAP to check the given two  strings are anagram or not.
package java_assignments;

import java.util.Arrays;

public class Assignment35 
{
	public static void main(String[] args) 
	{
		String s1= "taste";
		String s2= "state";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b1=Arrays.equals(c1, c2);
		if (b1 == true)
		{
			System.out.println("They are Anagram");
		}
		else
			{
				System.out.println("They are not Anagram");
			}
	}
}
