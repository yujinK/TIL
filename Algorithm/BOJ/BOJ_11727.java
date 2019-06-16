package boj;

import java.util.Scanner;

public class BOJ_11727 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 1;
		
		for (int i=2; i<=n; i++) {
			count = i % 2 == 0 ? (2*count+1) % 10007 : (2*count-1) % 10007;
		}
		
		System.out.println(count % 10007);
		scan.close();
	}

}
