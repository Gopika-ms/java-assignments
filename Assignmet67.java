//Assignment 67:WAP to utilize add method from Set Interface
package java_assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignmet67 
{
	public static void main(String[] args) 
	{
		Set s1= new HashSet();
		s1.add(78);
		s1.add(93);
		s1.add(82);
		s1.add(65);
		s1.add("Gopika");
		System.out.println("Displaying set s1 -> "+s1);
		
		System.out.println("Iterating Set s1 using iterator ->");
		Iterator i1= s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
