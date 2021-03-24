package boj;

import java.util.Scanner;

public class BOJ_10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if ((a >= b && a <= c) || (a >= c && a <= b)) {
			System.out.println(a);
		} else if ((b >= a && b <= c) || (b >= c && b <= a)) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
		scan.close();
	}

}
