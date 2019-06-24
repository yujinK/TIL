package boj;

import java.util.Scanner;

public class BOJ_11057 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[][] dp = new long[1001][10];
		
		for (int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for (int i=2; i<=n; i++) {
			dp[i][0] = dp[i-1][0];
			
			for (int j=1; j<=9; j++) {
				dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 10007;
			}
		}
		
		long sum = 0;
		for (int i=0; i<=9; i++) {
			sum += dp[n][i];
		}
		
		System.out.println(sum % 10007);
		scan.close();
	}

}
