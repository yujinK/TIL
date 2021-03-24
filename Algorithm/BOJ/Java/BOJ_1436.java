package boj;

import java.util.Scanner;

public class BOJ_1436 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0, i = 666, temp = 0;
		
		while (true) {
			temp = i;
			
			while (temp >= 666) {
				if (temp % 10 == 6 && (temp / 10 % 10 == 6) && (temp / 10 / 10 % 10 == 6)) {
					count++;
					break;
				}
				
				temp /= 10;
			}
			
			if (count == n) {
				System.out.println(i);
				break;
			}
			
			i++;
		}
		
		scan.close();
	}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int count = 0;
//		int result = 0;
//		int num = 666;
//		
//		while (count != n) {
//			if (String.valueOf(num).contains("666")) {
//				count++;
//				result = num;
//			}
//			
//			num++;
//		}
//		
//		System.out.println(result);
//		scan.close();
//	}

}
