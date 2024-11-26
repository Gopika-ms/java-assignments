//Assignment 29: Write a program to check whether the array accepts duplicate value or not 
package java_assignments;

public class Assignment29 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0]=36;		
		rollno[1]=40;
		rollno[2]=8;
		rollno[3]=8;
		
		System.out.println("Displaying the value in array using for loop");
		for(int i=0;i<=3;i++)
		{
			System.out.println(rollno[i]);
		}
	}
}
