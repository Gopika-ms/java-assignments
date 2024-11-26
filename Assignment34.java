//Assignment 34:WAP where the size of the array is 4, and check whether a given value (such as 50) is a part of the array or not.

package java_assignments;

public class Assignment34 
{
	public static void main(String[] args) 
	{
		int student[] = new int[4];
		student[0]=32;		
		student[1]=46;
		student[2]=54;
		student[3]=68;
		
		int notocheck=54;
		for(int i=0;i<4;i++)
		{
			if(notocheck == student[i])
			{
				System.out.println(notocheck + " is part of array at the index position "+ i);
			}
		}
	}

}
