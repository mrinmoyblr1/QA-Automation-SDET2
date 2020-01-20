/*LinkedList descendingIterator() method in Java with Examples
The descendingIterator() method of java.util.LinkedList class 
is used to return an iterator over the elements in this LinkedList in reverse sequential order.
The elements will be returned in order from last (tail) to first (head).
*/


// Java program to demonstrate 
// descendingIterator() method 
// for String value
package Practice;

import java.util.*;

public class descendingIterator1 {
	public static void main(String[] argv) throws Exception {
		try {
			// creating object of TreeMap<Integer, String>
			LinkedList<String> list = new LinkedList<String>();
			// add some elements to list
			list.add("A");
			list.add("B");
			list.add("C");
			// print the linked list
			System.out.println("LinkedList:" + list);
			// set Iterator as descending
			// using descendingIterator() method
			Iterator x = list.descendingIterator();
			// print list with descending order
			while (x.hasNext()) {
				System.out.println("Value is : " + x.next());
			}
		} catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
