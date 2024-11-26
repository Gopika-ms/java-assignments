//Assignment 60:WAP using Collection methods
package java_assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment60 
{
	public static void main(String[] args) 
	{
		Collection c1 =new ArrayList();
		c1.add(22);
		c1.add("Gopika");
		c1.add(80);
		c1.add(64.2);
		c1.add(true);
		System.out.println("Displaying Collection c1 -> " +c1);
		
		Collection c2 =new ArrayList();
		c2.addAll(c1);
		c2.add(421);
		System.out.println("Displaying Collection c2 -> " +c2);
		
		boolean b1 = c1.equals(c2);
		System.out.println("Checking c1 equals c2 -> " +b1);
	}
}
