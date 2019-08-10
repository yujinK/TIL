package boj;

import java.util.Scanner;

public class BOJ_1904 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tiles = new int[n+1];
		tiles[1] = 1;
		tiles[2] = 2;
		
		for (int i=3; i<=n; i++) {
			tiles[i] = (tiles[i-1] % 15746) + (tiles[i-2] % 15746);
		}
		
		System.out.println(tiles[n] % 15746);
		scan.close();
	}

}
