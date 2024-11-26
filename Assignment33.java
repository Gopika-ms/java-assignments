//Assignment 33:Write a program to accept the array at runtime.
package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment33 
{
	public static void main(String[] args)
	{
		int rollno[] = new int[3];
		
		Scanner s1 =new Scanner(System.in);
		System.out.println("Accepting the value for the array at runtime");
		for(int i=0;i<3;i++)
		{
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
}
