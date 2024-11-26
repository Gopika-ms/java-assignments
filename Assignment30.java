//Assignment 30:Write a array program to update the array value.
package java_assignments;

public class Assignment30 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		rollno[0]=36;		
		rollno[1]=24;
		rollno[2]=80;
		rollno[0]=92;
		
		System.out.println("Displaying the value in array using for loop");
		for(int i=0;i<=2;i++)
		{
			System.out.println(rollno[i]);
		}
	}
}
