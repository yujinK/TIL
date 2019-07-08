package boj;

import java.util.Scanner;

public class BOJ_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[10];
		int max = 0;
		
		for (int i=1; i<=9; i++) {
			int n = scan.nextInt();
			nums[i] = n;
			
			if (n > nums[max]) {
				max = i;
			}
		}
		
		System.out.println(nums[max]);
		System.out.println(max);
		scan.close();
	}

}
