package boj;

import java.util.Scanner;

public class BOJ_1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int numerator = 1, denominator = 1;
		int diff = 2, i = 0;
		int horizontal = 1, vertical = 1;
		
		while (!(Math.min(horizontal, vertical) <= x && Math.max(horizontal, vertical) >= x)) {
			if (i % 2 == 0) {
				horizontal++;
				vertical += diff;
				diff += 4;
			} else {
				horizontal += diff - 2;
				vertical++;
			}
			
			i++;
		}
		
		numerator = i + 1;
		
		while (vertical != x) {
			numerator--;
			denominator++;
			
			if (i % 2 == 0) {
				vertical++;
			} else {
				vertical--;
			}
		}
		
		System.out.println(numerator + "/" + denominator);
		scan.close();
	}

}
