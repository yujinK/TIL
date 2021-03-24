package boj;

import java.util.Scanner;

public class BOJ_9095 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] count = new int[12];
		count[1] = 1;
		count[2] = 2;
		count[3] = 4;
		
		for (int i=0; i<n; i++) {
			int input = scan.nextInt();
			for (int j=4; j<=input; j++) {
				count[j] = count[j-3] + count[j-2] + count[j-1];
			}
			
			System.out.println(count[input]);
		}
		
		scan.close();
	}

}
