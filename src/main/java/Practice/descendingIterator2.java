// Java program to demonstrate 
// descendingIterator() method 
// for Integer value 
package Practice;
import java.util.*; 
public class descendingIterator2 { 
    public static void main(String[] argv) 
        throws Exception 
    { 
        try { 
            // creating object of TreeMap<Integer, String> 
            LinkedList<Integer> 
                list = new LinkedList<Integer>(); 
            // add some elements to list 
            list.add(10); 
            list.add(20); 
            list.add(30); 
            // print the linked list 
            System.out.println("LinkedList:" + list); 
            // set Iterator as descending 
            // using descendingIterator() method 
            Iterator x = list.descendingIterator(); 
            // print list with descending order 
            while (x.hasNext()) { 
                System.out.println("Value is : "
                                   + x.next()); 
            } 
        } 
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 
