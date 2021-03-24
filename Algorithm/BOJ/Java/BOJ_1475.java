package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] n = br.readLine().split("");
		int[] number = new int[10];
		int count = 0;
		
		for (int i=0; i<n.length; i++) {
			number[Integer.parseInt(n[i])]++;
		}
		
		count = (number[6] + number[9]) / 2 + (number[6] + number[9]) % 2;
		
		for (int i=0; i<number.length; i++) {
			if (i != 6 && i != 9 && number[i] > count) {
				count = number[i];
			}
		}
		
		System.out.println(count);
	}

}
