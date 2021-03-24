package boj;

import java.util.Scanner;

public class BOJ_2193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] dp = new long[91];
		dp[1] = 1;
		dp[2] = 1;
		
		for (int i=3; i<=n; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		
		System.out.println(dp[n]);
		scan.close();
	}
}
