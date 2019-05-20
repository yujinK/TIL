package boj;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2908 {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String[] num = scan.nextLine().split(" ");
//		for (int i=0; i<num.length; i++) {
//			num[i] = num[i].substring(2, 3) + num[i].substring(1, 2) + num[i].substring(0, 1);
//		}
//		
//		System.out.println(Math.max(Integer.parseInt(num[0]), Integer.parseInt(num[1])));
//		scan.close();
//	}
	
	public static void main(String[] args) throws IOException {
		int[] A = new int[3];
		int[] B = new int[3];
		
		for (int i=0; i<3; i++) {
			A[i] = System.in.read() - '0';
		}
		
		System.in.read();
		
		for (int i=0; i<3; i++) {
			B[i] = System.in.read() - '0';
		}
		
		int a = A[2] * 100 + A[1] * 10 + A[0];
		int b = B[2] * 100 + B[1] * 10 + B[0];
		
		System.out.println(Math.max(a, b));
	}
}
