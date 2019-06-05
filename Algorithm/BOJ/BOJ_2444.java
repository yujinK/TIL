package boj;

import java.util.Scanner;

public class BOJ_2444 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = "";
		
		for (int i=0; i<2*n-1; i++) {
			if (i == 0) {
				for (int j=0; j<n-1; j++) {
					s += " ";
				}
				
				s += "*";
			} else if (i < n) {
				s = s.substring(1) + "**";
			} else {
				s = " " + s.substring(0, s.length()-2);
			}
			
			System.out.println(s);
		}
		
		scan.close();
	}

}
