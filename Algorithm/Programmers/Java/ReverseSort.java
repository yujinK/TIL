package programmers;

import java.util.Arrays;

public class ReverseSort {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new StringBuilder(new String(c)).reverse().toString();
	}
	
//	public static String solution(String s) {
//		char[] c = s.toCharArray();
//		
//		for (int i=0; i<c.length-1; i++) {
//			for (int j=i+1; j<c.length; j++) {
//				if (c[i] < c[j]) {
//					char temp = c[i];
//					c[i] = c[j];
//					c[j] = temp;
//				}
//			}
//		}
//		
//		return String.valueOf(c);
//	}

}
