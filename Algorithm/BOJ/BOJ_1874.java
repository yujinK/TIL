package boj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();
		int count = 1;
		int[] stack = new int[n];
		int top = -1;

		for (int i=0; i<n; i++) {
			int data = scan.nextInt();

			while (count <= data) {
				top++;
				stack[top] = count;
				count++;
				sb.append("+\n");
			}

			if (stack[top] == data) {
				sb.append("-\n");
				top--;
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println(sb.toString());
	}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		Stack<Integer> stack = new Stack<>();
//		String result = "";
//		int n = scan.nextInt();
//		int[] nums = new int[n];
//		int now = 1;
//		int index = 0;
//
//		for (int i=0; i<n; i++) {
//			nums[i] = scan.nextInt();
//		}
//
//		while (index < n) {
//			if (!stack.isEmpty() && stack.peek() > nums[index]) {
//				System.out.println("NO");
//				return;
//			}
//			if (!stack.isEmpty() && stack.peek() == nums[index]) {
//				stack.pop();
//				index++;
//				result += "-\n";
//			} else {
//				stack.push(now);
//				now++;
//				result += "+\n";
//			}
//		}
//
//		for (int i : stack) {
//			result += "-\n";
//		}
//
//		System.out.println(result);
////		for (String s : output) {
////			System.out.println(s);
////		}
//	}
}
