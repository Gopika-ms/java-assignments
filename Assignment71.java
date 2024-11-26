/*Assignment 71: WAP using Map that stores the names of fruits and 
 their quantities then perform actions: 
i)retrieve & print fruit quantity
ii)remove fruit
iii)print all fruits with quantity
*/
package java_assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment71 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m1 =new HashMap<String,Integer>();
		m1.put("Apple", 2);
		m1.put("Mango", 4);		
		m1.put("Strawberry", 6);
		m1.put("Guava", 5);
		m1.put("DragonFruit", 3);
		m1.put("Watermelon", 5);
		System.out.println("Displaying the Map m1 ");
		System.out.println(m1);	
		
		System.out.println("retrieve & print fruit quantity");
		for(Integer i1: m1.values())
		{
			System.out.println(i1);
		}
		
		System.out.println("remove fruit");
		m1.remove("Strawberry");
		System.out.println(m1);	
		
		System.out.println("print all fruits with quantity");
		for(Entry<String, Integer> i2: m1.entrySet())
		{
			System.out.println(i2);
		}
	}
}
