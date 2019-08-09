package boj;

import java.util.Scanner;

public class BOJ_1436 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int result = 0;
		int num = 666;
		
		while (count != n) {
			if (String.valueOf(num).contains("666")) {
				count++;
				result = num;
			}
			
			num++;
		}
		
		System.out.println(result);
		scan.close();
	}

}
