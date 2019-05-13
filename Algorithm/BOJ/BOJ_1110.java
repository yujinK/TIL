package boj;

import java.util.Scanner;

public class BOJ_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int newNum = n;
		int count = 0;
		
		while(!(count > 0 && newNum == n)) {
			int sum = (newNum / 10) + (newNum % 10);
			newNum = (newNum % 10) * 10 + (sum % 10);
			count++;
		}
		
		System.out.println(count);
		scan.close();
	}

}
