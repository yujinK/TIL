package boj;

import java.util.Scanner;

public class BOJ_4153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			int n3 = scan.nextInt();
			
			if (n1 == 0 && n2 == 0 && n3 == 0) return;
			
			if (n1 > n3) {
				int temp = n1;
				n1 = n3;
				n3 = temp;
			}
			if (n2 > n3) {
				int temp = n2;
				n2 = n3;
				n3 = temp;
			}
			
			if (n3 * n3 == n1 * n1 + n2 * n2) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}

}
