package SDET2;

import java.util.HashSet;
import java.util.Set;

/**
 * Q. Given a String(say "hello world"), print the following:
 * 	a. Index/position of duplicate characters?
 * 	b. Total number of duplicate characters?
 *     Example: for String "hello world"
 *  a. Index/position of duplicate character(s): 3, 7, 9
 *  b. Total number of duplicate characters: 3
 *  
 *  Hint: whenever you see the term 'duplicate' in the question, most likely you should use 'Set' datastructure.
 */
public class SetDemo {
	public static void main(String[] args) {
		String s = "hello world";
		
		char[] charArray = s.toCharArray(); 
		// toCharArray is a String object return a Char Array		
		
		Set<Character> set = new HashSet<Character>(); 
		
		// HashSet is a class which implements Set interface	
		
		int ctr = 0;
		for(int i=0; i<charArray.length; i++) {
			if(!set.add(charArray[i]))
			// Here .add methods will return true is we are able to insert the character to set
			// and it'll return false if it's duplicate
			{
				System.out.println("Index/position of duplicate character(s): " + i);
				ctr++;
			}
		}
		System.out.println("Total number of duplicate characters: " + ctr);
	}
}
