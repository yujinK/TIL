package boj;

import java.util.Scanner;

public class BOJ_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			int input = scan.nextInt();
			
			if (input < x) {
				System.out.print(input + " ");
			}
		}
		
		scan.close();
	}

}
