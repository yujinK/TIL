package boj;

import java.util.Scanner;

public class BOJ_2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int room = 1;
		int i = 0;
		
		while (n > room) {
			i++;
			room = room + (6 * i);	
		}
		
		System.out.println(i+1);
		scan.close();
	}

}
