package boj;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i=0; i<10; i++) {
			int n = scan.nextInt();
			hs.add(n);
		}
		
		System.out.println(hs.size());
		scan.close();
	}

}
