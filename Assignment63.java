/*Assignment 63
Please use backward iteration using listiterator for arraylist without 
forward iteration and note down the error
 */
package java_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment63 
{
	public static void main(String[] args) 
	{
		List l2=	new ArrayList();
		l2.add(12);
		l2.add(26);
		l2.add(64);
		l2.add(482);
		l2.add(28);
		l2.add(86);
		l2.add(64);
		
		ListIterator i1=	l2.listIterator();
		
		System.out.println("Backward iteration using List_Iterator l2 ->");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}

	}
}
