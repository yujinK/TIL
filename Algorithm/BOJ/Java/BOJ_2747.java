package boj;

import java.util.Scanner;

public class BOJ_2747 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] fibo = new int[n+1];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for (int i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		System.out.println(fibo[n]);
		scan.close();
	}

}
