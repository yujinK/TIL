package boj;

import java.util.Scanner;

public class BOJ_1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int d = Math.min(y, h-y);
		d = Math.min(d, Math.min(x, w-x));
		System.out.println(d);
	}

}
