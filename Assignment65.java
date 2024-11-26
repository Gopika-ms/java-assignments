//Assignment 65:WAP using ListIterator
package java_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment65 
{
	public static void main(String[] args) 
	{
		List l2=	new ArrayList();
		l2.add(82);
		l2.add(44);
		l2.add(86);
		l2.add(68);
		
		System.out.println("Forward iteration using List_Iterator l2 ->");
		ListIterator i1=	l2.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Backward iteration using List_Iterator l2 ->");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}

	}
}
