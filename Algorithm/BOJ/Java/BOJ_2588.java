package boj;

import java.util.Scanner;

public class BOJ_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int remainder = n2;
		
		for (int i=0; i<3; i++) {
			System.out.println(n1 * (remainder % 10));
			remainder /= 10;
		}
		
		System.out.println(n1 * n2);
		scan.close();
	}

}
