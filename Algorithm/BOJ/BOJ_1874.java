package boj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		ArrayList<String> output = new ArrayList<String>();
		int n = scan.nextInt();
		int[] nums = new int[n];
		int now = 1;
		int index = 0;
		
		for (int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}

		while (index < n) {
			if (!stack.isEmpty() && stack.peek() > nums[index]) {
				System.out.println("NO");
				return;
			}
			if (!stack.isEmpty() && stack.peek() == nums[index]) {
				stack.pop();
				index++;
				output.add("-");
			} else {
				stack.push(now);
				now++;
				output.add("+");
			}
		}
		
		for (int i : stack) {
			output.add("-");
		}
		
		for (String s : output) {
			System.out.println(s);
		}
	}
}
