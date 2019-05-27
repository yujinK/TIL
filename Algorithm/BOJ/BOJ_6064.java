package boj;

import java.util.Scanner;

public class BOJ_6064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int i=0; i<t; i++) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			System.out.println(isKaing(m, n, x, y));
		}
		
		scan.close();
	}
	
	public static int isKaing(int m, int n, int x, int y) {
		int lcm = getLCM(m, n);
		int count = 0;
		
		while (count <= lcm) {
			if (count == 0) {
				count = x;
			} else {
				count += m;
			}
			
			int positionX = x;
			int positionY = count % n == 0 ? n : count % n;
			
			if (positionX == x && positionY == y) {
				return count;
			}
		}
		
		return -1;
	}
	
	public static int getLCM(int x, int y) {
		return (x * y) / getGCD(x, y);
	}
	
	public static int getGCD(int x, int y) {
		if (y > x) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		int r = x % y;
		
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		
		return y;
	}

}
