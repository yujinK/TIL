package boj;

import java.util.Scanner;

public class BOJ_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int caseCount = scan.nextInt();
		
		for (int i=0; i<caseCount; i++) {
			int n = scan.nextInt();
			double[] scores = new double[n];
			int sum = 0;
			double count = 0;
			
			for (int j=0; j<n; j++) {
				scores[j] = scan.nextDouble();
				sum += scores[j];
			}
			
			double avg = sum / n;
			
			for (int j=0; j<n; j++) {
				if (scores[j] > avg) {
					count++;
				}
			}
			
			System.out.println(String.format("%.3f", count / n * 100) + "%");
		}
	
		scan.close();
	}

}
