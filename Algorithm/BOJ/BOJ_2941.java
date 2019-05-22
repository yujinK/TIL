package boj;

import java.util.Scanner;

public class BOJ_2941 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int count = 0;
		String s = scan.nextLine();
		
		for (int i=0; i<croatia.length; i++) {
			if (s.indexOf(croatia[i]) != -1) {
				s = s.replaceAll(croatia[i], "*");
			}
		}
		
		count += s.length();
		System.out.println(count);
		scan.close();
	}

}
