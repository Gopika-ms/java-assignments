/*Assignment 69:WAP using the Map interface and iterate over its entries 
 using an Iterator with a while loop.
*/
package java_assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment69 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m1 =new HashMap<String,Integer>();
		m1.put("Gopika", 23456);
		m1.put("Vinayaka", 47658);		
		m1.put("Murugan", 676543);
		m1.put("Devi", 86549);
		m1.put("Ayyappa", 1087650);
		System.out.println("Displaying the Map m1 ");
		System.out.println(m1);	
		
		System.out.println("Displaying key and values using Iterator()");
		Iterator <Entry<String, Integer>> i1 = m1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
		
}
