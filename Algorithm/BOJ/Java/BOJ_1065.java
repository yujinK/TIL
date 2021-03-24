package boj;

import java.util.Scanner;
import java.util.stream.Stream;

public class BOJ_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		for (int i=1; i<=n; i++) {
			if (findHanSu(i)) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}
 	
	public static boolean findHanSu(int n) {
		int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		
		if (digits.length == 1 || digits.length == 2) {
			return true;
		} else {
			int difference = digits[1] - digits[0];
			
			for (int i=2; i<digits.length; i++) {
				if (digits[i] - digits[i-1] != difference) {
					return false;
				}
			}
		}		
		
		return true;
	}

}
