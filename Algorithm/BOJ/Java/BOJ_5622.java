package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_5622 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] alphabet = br.readLine().toCharArray();
		int seconds = 0;
		
		for (int i=0; i<alphabet.length; i++) {
			if (alphabet[i] >= 'A' && alphabet[i] <= 'C') {
				seconds += 3;
			} else if (alphabet[i] >= 'D' && alphabet[i] <= 'F') {
				seconds += 4;
			} else if (alphabet[i] >= 'G' && alphabet[i] <= 'I') {
				seconds += 5;
			} else if (alphabet[i] >= 'J' && alphabet[i] <= 'L') {
				seconds += 6;
			} else if (alphabet[i] >= 'M' && alphabet[i] <= 'O') {
				seconds += 7;
			} else if (alphabet[i] >= 'P' && alphabet[i] <= 'S') {
				seconds += 8;
			} else if (alphabet[i] >= 'T' && alphabet[i] <= 'V') {
				seconds += 9;
			} else if (alphabet[i] >= 'W' && alphabet[i] <= 'Z') {
				seconds += 10;
			}
		}
		
		System.out.print(seconds);
	}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int seconds = 0;
//		String alphabet = scan.nextLine();
//		
//		for (int i=0; i<alphabet.length(); i++) {
//			char c = alphabet.charAt(i);
//			
//			switch(c) {
//				case 65:
//				case 66:
//				case 67:
//					seconds += 3;
//					break;
//				case 68:
//				case 69:
//				case 70:
//					seconds += 4;
//					break;
//				case 71:
//				case 72:
//				case 73:
//					seconds += 5;
//					break;
//				case 74:
//				case 75:
//				case 76:
//					seconds += 6;
//					break;
//				case 77:
//				case 78:
//				case 79:
//					seconds += 7;
//					break;
//				case 80:
//				case 81:
//				case 82:
//				case 83:
//					seconds += 8;
//					break;
//				case 84:
//				case 85:
//				case 86:
//					seconds += 9;
//					break;
//				case 87:
//				case 88:
//				case 89:
//				case 90:
//					seconds += 10;
//					break;
//			}
//		}
//		
//		System.out.println(seconds);
//		scan.close();
//	}

}
