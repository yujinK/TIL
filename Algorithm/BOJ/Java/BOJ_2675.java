package boj;

import java.util.Scanner;

public class BOJ_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = scan.nextInt();
			String s = scan.next().trim();
			
			for (int j=0; j<s.length(); j++) {
				for (int k=0; k<n; k++) {
					System.out.print(s.substring(j, j+1));
				}
			}
			
			System.out.println();
		}
 
		scan.close();
	}

}
