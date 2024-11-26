//Assignment 32:Write a program to check whether the two given arrays are equal or not.

package java_assignments;

import java.util.Arrays;

public class Assignment32 
{
	public static void main(String[] args) 
	{
		int no1[] = new int[4];
		no1[0]=10;		
		no1[1]=20;
		no1[2]=30;
		no1[3]=40;
		
		int no2[] = new int[4];
		no2[0]=10;		
		no2[1]=20;
		no2[2]=30;
		no2[3]=40;
		
		boolean b1 = Arrays.equals(no1, no2);
		System.out.println("Checking two arrays are equal or not -> " + b1);
		
		if(b1==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}	
		
}
