package boj;

import java.util.Scanner;

public class BOJ_10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
		scan.close();
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}
