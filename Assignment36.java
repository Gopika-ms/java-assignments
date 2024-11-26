/* Assignment 36: WAP to find out the alphabets char, digits, spaces, 
and  special char from the given strings.*/
package java_assignments;

public class Assignment36 
{
	public static void main(String[] args) 
	{
		int count_of_alphabet=0;
		int count_of_numeric=0;
		int count_of_space=0;
		int count_of_specialchar=0;
		String a="sarvodaya @* 1234";
		char []c1=			a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			boolean b1=	Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
			}
			boolean b2=	Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_numeric++;
			}
			boolean b3=	Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
		System.out.println("The number of alphabets are:- "+count_of_alphabet);
		System.out.println("The number of numeric are:- "+count_of_numeric);
		System.out.println("The number of spaces are:- "+count_of_space);
	
		count_of_specialchar= a.length()-(count_of_alphabet+count_of_numeric+count_of_space);
		System.out.println("The number of special characters are:- "+count_of_specialchar);
	}
}
