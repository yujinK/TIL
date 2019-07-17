package boj;

import java.util.Scanner;

public class BOJ_3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		
		for (int i=0; i<3; i++) {
			x ^= scan.nextInt();
			y ^= scan.nextInt();
		}
		
		System.out.println(x + " " + y);
		scan.close();
	}

}
