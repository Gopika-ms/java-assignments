package java_assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment70 
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
		
		System.out.println("Displaying keys alone using for loop-keySet()");
		for(String s1: m1.keySet())
		{
			System.out.println(s1);
		}
		
		System.out.println("Displaying values alone using for loop-values()");
		for(Integer i1: m1.values())
		{
			System.out.println(i1);
		}
		
		System.out.println("Displaying key and values  using for loop-entrySet()");
		for(Entry<String, Integer> i2: m1.entrySet())
		{
			System.out.println(i2);
		}
		
	}
}
