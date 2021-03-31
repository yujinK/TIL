package programmers;

import java.util.Stack;

public class PairOut {
	
	public static void main(String[] args) {
		String s = "abbaababb";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		Stack<String> stack = new Stack<String>();
		
		for (int i=0; i<s.length(); i++) {
			String sub = s.substring(i, i+1);
			if (!stack.isEmpty() && stack.peek().equals(sub)) {
				stack.pop();
			} else {
				stack.push(sub);
			}
		}
		
		return stack.size() == 0 ? 1 : 0;
	}

}
