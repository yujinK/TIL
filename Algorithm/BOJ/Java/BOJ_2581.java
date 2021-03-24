package boj;

import java.util.Scanner;

public class BOJ_2581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0, min = 0;
		boolean flag = true;
		
		for (int i=m; i<=n; i++) {
			if (i == 1) {
				continue;
			}
			for (int j=2; j<Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				if (sum == 0) {
					min = i;
				}
				
				sum += i;
			}
			
			flag = true;
		}
		
		if (min == 0 && sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		scan.close();
	}

}
