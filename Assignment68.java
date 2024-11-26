//Assignment 68:WAP using SortedSet
package java_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Assignment68 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList<>();
		a1.add(11);
		a1.add(12);
		a1.add(78);
		a1.add(90);
		a1.add(65);
		a1.add(32);
		a1.add(45);
	
		
		System.out.println("Displaying Orginal ArrayList -> "+ a1);
		
		Collections.sort(a1);
		System.out.println("Displaying after sorting ArrayList -> "+ a1);
	}

}
