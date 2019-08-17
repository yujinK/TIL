package boj;

import java.util.Scanner;

public class BOJ_9461 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = scan.nextInt();
			System.out.println(getSideLength(n));
		}
		
		scan.close();
	}
	
	public static long getSideLength(int n) {
		long[] sideLengths = new long[101];
		sideLengths[1] = sideLengths[2] = sideLengths[3] = 1;
		sideLengths[4] = sideLengths[5] = 2;
		
		for (int i=6; i<=n; i++) {
			sideLengths[i] = sideLengths[i-5] + sideLengths[i-1];
		}
		
		return sideLengths[n];
	}

}
