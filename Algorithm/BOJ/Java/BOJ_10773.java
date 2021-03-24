package boj;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10773 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		int k = scan.nextInt();
		
		for (int i=0; i<k; i++) {
			int n = scan.nextInt();
			
			if (n == 0) {
				stack.pop();
			} else {
				stack.push(n);
			}
		}
		
		for (int n : stack) {
			sum += n;
		}
		
		System.out.println(sum);
		scan.close();
	}

}
