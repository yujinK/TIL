package boj;

import java.util.Scanner;

public class BOJ_4948 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = -1;
		int count = 0;
		
		while (true) {
			n = scan.nextInt();
			
			if (n == 0) {
				return;
			}
			
			for (int i=n+1; i<=2*n; i++) {
				if (isPrimeNumber(i)) {
					count++;
				}
			}
			
			System.out.println(count);
			count = 0;
		}
	}
	
	public static boolean isPrimeNumber(int n) {
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
