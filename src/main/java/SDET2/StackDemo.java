package SDET2;
import java.util.Stack;
/**
 * Q.Given a String that contains only brackets, write a method named isBalanced(String s) 
 *   which returns true if brackets in the given String are balanced, otherwise returns false.
 * example:
 * a. "{ [ ( ) ] }" - isBalanced(String s) should return true
 * b. "{ } [ ] ( )" - isBalanced(String s) should return true
 * c. "{ [ ( ] ) }" - isBalanced(String s) should return false
 * d. "{ } [ ] ("   - isBalanced(String s) should return false
 *
 * Hint: when you come across a closing bracket, check if it matches with the LAST opening bracket 
 * thats still open.
 */
public class StackDemo {
	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack();
		// We cannot store characters in the stack  
		// Here Character is a class in java.lang.Character. 
		// Primitive characters cannot be store in the stack
		// Here the Character class is the wrapper class which wrap 
		// the primitive characters to an object and store in the stack
		for(char c: s.toCharArray()) {
			// for each primitive character 
			// Here s.toCharArray() will return primitive character array
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
			}else if(c == '}') {
				if(!(stack.pop() == '{')) {
					return false;
				}
			}else if(c == ']') {
				if(!(stack.pop() == '[')) {
					return false;
				}
			}else if(c == ')') {
				if(!(stack.pop() == '(')) {
					return false;
				}
			}
		}
		if(!stack.empty()) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "{[( ljsdf;ljklj )]}";//balanced
		String s2 = "{}[]()";//balanced
		String s3 = "{[(sfsfsfs])}";//not balanced
		String s4 = "{}[](";//not balanced
		System.out.println("s1 is balanced: " + isBalanced(s1));
		System.out.println("s2 is balanced: " + isBalanced(s2));
		System.out.println("s3 is balanced: " + isBalanced(s3));
		System.out.println("s4 is balanced: " + isBalanced(s4));
	}
}
