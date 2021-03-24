package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_9020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] prime = new boolean[10001];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		
		for (int i=2; i<prime.length; i++) {
			for (int j=2; j<=Math.sqrt(i); j++) {
				if (i % j == 0) {
					prime[i] = false;
					break;
				}
			}
		}
		
		int t = scan.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = scan.nextInt();
			int partition1 = 0;
			int partition2 = 0;
			
			for (int j=n-1; j>=n/2; j--) {
				if (prime[j] && prime[n-j]) {
					partition1 = n - j;
					partition2 = j;
				}
			}
			
			System.out.println(partition1 + " " + partition2);
		}
	}

}
