package boj;

import java.util.Scanner;

public class BOJ_11047 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int money = scan.nextInt();
		int[] coins = new int[n];
		int idx = 0, count = 0;
		
		for (int i=n-1; i>=0; i--) {
			coins[i] = scan.nextInt();
		}
		
		while (money != 0) {
			if (coins[idx] > money) {
				idx++;
			} else {
				money -= coins[idx];
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}
