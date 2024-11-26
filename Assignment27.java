//Assignment 27:Write a program where you get an array index out of bound exception.
package java_assignments;

public class Assignment27 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0]=78;		
		rollno[1]=7;
		rollno[2]=71;
		rollno[3]=6;
		
		System.out.println("Displaying the value in array using for loop");
		for(int i=0;i<=5;i++)
		{
			System.out.println(rollno[i]);
		}
	}
}
