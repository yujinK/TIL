package boj;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_4949 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		
		while(true) {
			String line = scan.nextLine();
			
			if (line.equals(".")) {
				break;
			}
			
			char[] c = line.toCharArray();
			
			for (int i=0; i<c.length; i++) {
				if (c[i] == '(' || c[i] == '[') {
					stack.push(c[i]);
				} else if (c[i] == ')') {
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					} else {
						stack.push(')');
						break;
					}
				} else if (c[i] == ']') {
					if (!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					} else {
						stack.push(']');
						break;
					}
				}
			}
			
			if (stack.size() > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
			
			stack.clear();
		}
		
		scan.close();
	}

}
