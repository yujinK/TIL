package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[1] = false;
		
		for (int i=2; i*i<=n; i++) {
			if (prime[i]) {
				for (int j=i*2; j<=n; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		for (int i=m; i<=n; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}

}
