/*Assignment 49:WAP where the your name is like ""RAM"" and print the output like:
R
A
M
And Print the second output as like:
M
A
R */
package java_assignments;
public class Assignment49 
{
	public static void main(String[] args) 
	{
		String input="RAM";
		char[] c1= input.toCharArray();
		//System.out.println(c1);
		for(int i=0;i<=input.length()-1;i++)
		{
			System.out.println(c1[i]);
		}
		System.out.println("Displaying each character of String in Reverse order");
		for(int j=input.length()-1;j<=input.length()-1;j--)
		{
			System.out.println(c1[j]);
		}
	}
}
