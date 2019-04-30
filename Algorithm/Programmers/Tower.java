package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Tower {

	public static void main(String[] args) {
		int[] heights = {3, 9, 9, 3, 5, 7, 2};
		System.out.println(Arrays.toString(solution(heights)));
	}
	
	public static int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<heights.length; i++) {
			for (int j=0; j<i; j++) {
				if (heights[j] > heights[i]) {
					stack.push(j + 1);
				}
			}
			
			if (!stack.isEmpty()) {
				answer[i] = stack.pop();
			} else {
				answer[i] = 0;
			}
			
			stack.clear();
		}
		
		return answer;
	}

}
