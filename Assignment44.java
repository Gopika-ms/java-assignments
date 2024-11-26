/*Assignment 44
"WAP to check from the given string exact letters count. 
Example: String name= ""kv no 2"";"*/
package java_assignments;

public class Assignment44 
{
	public static void main(String[] args) 
	{
		String name="kv no 2";
		int l = name.length();
		System.out.println(l);
		char[] c1= name.toCharArray();
		int count_of_alphabets=0;
		System.out.println(c1);
		for(int i=0;i<7;i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				count_of_alphabets++;
			}	
		}
		System.out.println("Count of Alphabets are -> " +count_of_alphabets);
	}
}
