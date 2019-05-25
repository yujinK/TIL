package boj;

import java.util.Scanner;

public class BOJ_1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		for (int i=0; i<n; i++) {
			int input = scan.nextInt();
			boolean flag = true;
			
			if (input == 1) {
				flag = false;
			}
			
			for (int j=2; j<=input/2; j++) {
				if (input % j == 0) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}
