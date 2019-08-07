package boj;

import java.util.Scanner;

public class BOJ_7568 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] person = new int[n][2];
		
		for (int i=0; i<n; i++) {
			person[i][0] = scan.nextInt();
			person[i][1] = scan.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			int count = 1;
			
			for (int j=0; j<n; j++) {
				if (i == j) {
					continue;
				}
				
				if (person[j][0] > person[i][0] && person[j][1] > person[i][1]) {
						count++;
				}
			}
			
			System.out.print(count + " ");
			scan.close();
		}
	}

}
