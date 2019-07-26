package boj;

import java.util.Scanner;

public class BOJ_2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0, answer = 0, i = 239;
		
		while (i < n) {
			i++;
			sum = i + getDigits(i);
			
			if (sum == n) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}
	
	public static int getDigits(int n) {
		int sum = 0;
		
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
