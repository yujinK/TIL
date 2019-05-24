package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			String[] input = br.readLine().split(" ");
			int h = Integer.parseInt(input[0]);
//			int w = Integer.parseInt(input[1]);
			int n = Integer.parseInt(input[2]);
			String result = "";
			
			if (n % h == 0) {
				result += input[0];
				result += String.format("%02d", n / h);
			} else {
				result += String.valueOf(n % h);
				result += String.format("%02d", (n / h) + 1);
			}
			
			System.out.println(result);
		}
	}

}
