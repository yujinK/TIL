package boj;

import java.util.Scanner;

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

}
