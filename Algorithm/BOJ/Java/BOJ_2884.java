package boj;

import java.util.Scanner;

public class BOJ_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if (m >= 45) {
			m -= 45;
		} else {
			h--;
			if (h < 0) {
				h = 23;
			}
			m = (m + 60) - 45;
		}
		
		System.out.println(h + " " + m);
		scan.close();
	}

}
