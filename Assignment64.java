//Assignment 64:WAP using Iterator (process of iteration through iterable )
package java_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment64 
{
	public static void main(String[] args) 
	{
		ArrayList a1=	new ArrayList();
		a1.add(10);
		a1.add(27);
		a1.add(634);
		a1.add(90);
		
		System.out.println("Displaying ArrayList a1 -> "+a1);
		
		System.out.println("Iterating a1 using iterator ->");
		Iterator i1=	a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
