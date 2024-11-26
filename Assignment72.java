/*Assignment 72 : WAP using Map to store student roll numbers and 
 * their names then perform actions: 
 * i)Check if specific roll no and name exist in map & print if exists
*/
package java_assignments;

import java.util.HashMap;
import java.util.Map;


public class Assignment72 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1 =new HashMap<Integer,String>();
		m1.put(101,"Gopika");
		m1.put(102,"Vinayaka");		
		m1.put(103,"Murugan");
		m1.put(104,"Devi");
		m1.put(105,"Ayyappa");
		System.out.println("Displaying the Map m1 ");
		System.out.println(m1);	
		
		int rollno=104;
		String sname="Devi";
		
		if (m1.containsKey(rollno)) {
            System.out.println("Roll number " + rollno + " exists in the map");
        } else {
            System.out.println("Roll number " + rollno + " does not exist.");
        }
		
        if (m1.containsValue(sname)) {
            System.out.println("Name " + sname + " exists in the map.");
        } else {
            System.out.println("Name " + sname + " does not exist in the map.");
        }
	}
}
