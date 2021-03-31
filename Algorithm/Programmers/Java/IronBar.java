package programmers;

import java.util.Stack;

public class IronBar {

	public static void main(String[] args) {
		String arrangement = "((((()()))))";
		System.out.println(solution(arrangement));
	}
	
	public static int solution(String arrangement) {
		String[] s = arrangement.split("");
		Stack<String> stack = new Stack<String>();
		int answer = 0;
		
		for (int i=0; i<s.length; i++) {
			if (s[i].equals("(") && s[i+1].equals(")")) {
				answer += stack.size();
				i++;
			} else if (s[i].equals("(")) {
				stack.push("(");
			} else if (s[i].equals(")")) {
				stack.pop();
				answer++;
			}
		}
		
		return answer;
	}

}
