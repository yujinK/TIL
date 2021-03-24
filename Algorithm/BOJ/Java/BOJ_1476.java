package boj;

import java.util.Scanner;

public class BOJ_1476 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputE = scan.nextInt();
		int inputS = scan.nextInt();
		int inputM = scan.nextInt();
		System.out.println(calcYear(inputE, inputS, inputM));
		scan.close();
	}
	
	public static int calcYear(int inputE, int inputS, int inputM) {
		int E = 0;
		int S = 0;
		int M = 0;
		int year = 0;
		
		while(true) {
			if (E == inputE && S == inputS && M == inputM) {
				return year;
			}
			
			E = (E + 1) % 15;
			S = (S + 1) % 28;
			M = (M + 1) % 19;
			year++;
			
			if (E == 0) E = 15;
			if (S == 0) S = 28;
			if (M == 0) M = 19;
		}
	}

}
