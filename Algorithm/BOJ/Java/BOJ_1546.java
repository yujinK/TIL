package boj;

import java.util.Scanner;

public class BOJ_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		double m = 0, sum = 0;
		double[] scores = new double[n];
		
		for (int i=0; i<n; i++) {
			scores[i] = scan.nextDouble();
			if (m < scores[i]) {
				m = scores[i];
			}
		}
		
		for (int i=0; i<n; i++) {
			sum += scores[i]/m*100;
		}
		
		System.out.println(sum/n);
		scan.close();
	}

}
