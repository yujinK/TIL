package boj;

import java.util.Scanner;

public class BOJ_10430 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c * b % c) % c);
		scan.close();
	}

}
