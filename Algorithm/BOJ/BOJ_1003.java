package boj;

import java.util.Scanner;

public class BOJ_1003 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] fibo = new int[41][2];
		fibo[0][0] = 1;
		fibo[1][1] = 1;
		
		for (int i=2; i<=40; i++) {
			fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
			fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
		}
		
		int t = scan.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = scan.nextInt();
			System.out.println(fibo[n][0] + " " + fibo[n][1]);
		}
		
		scan.close();
	}
}
