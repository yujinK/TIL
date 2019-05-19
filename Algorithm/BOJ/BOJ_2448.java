package boj;

import java.util.Scanner;

public class BOJ_2448 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		s[0] = "  *  ";
		s[1] = " * * ";
		s[2] = "*****";
		
		for (int k=1; (int) 3*Math.pow(2, k)<=n; k++) {
			makeStar(s, k);
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(s[i]);
		}
		
		scan.close();
	}
	
	public static void makeStar(String[] s, int k) {
		int bottom = 3 * (int)Math.pow(2, k);
		int middle = bottom / 2;
		
		for (int i=middle; i<bottom; i++) {
			s[i] = s[i-middle] + " " + s[i-middle];
 		}
		
		for (int i=0; i<middle; i++) {
			String blank = "";
			for (int j=0; j<middle; j++) {
				blank += " ";
			}
			
			s[i] = blank + s[i] + blank;
		}
	}

}