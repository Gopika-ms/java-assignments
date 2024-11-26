//Assignment 66:WAP using upcasting concept
package java_assignments;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Assignment66 
{
	public static void main(String[] args) 
	{
		Deque d1=	new ArrayDeque();
		d1.add(20);
		d1.add(67);
		d1.add(90);
		d1.add(56);
		
		System.out.println("Displaying SortedSet d1 -> "+d1);
		
		System.out.println("Iterating d1 using iterator ->");
		Iterator i1=	d1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
