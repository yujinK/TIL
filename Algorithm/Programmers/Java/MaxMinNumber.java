package programmers;

public class MaxMinNumber {

	public static void main(String[] args) {
		String s = "-1 -1";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String[] str = s.split(" ");
		int min, max;
		min = max = Integer.parseInt(str[0]);
		
		for (int i=1; i<str.length; i++) {
			int n = Integer.parseInt(str[i]);
			
			if (max < n) {
				max = n;
			}
			if (min > n) {
				min = n;
			}
		}
		
		return min + " " + max;
	}
	
//	public static String solution(String s) {
//		String[] str = s.split(" ");
//		
//		for (int i=0; i<str.length-1; i++) {
//			for (int j=i+1; j<str.length; j++) {
//				if (Integer.parseInt(str[i]) > Integer.parseInt(str[j])) {
//					String temp = str[i];
//					str[i] = str[j];
//					str[j] = temp;
//				}
//			}
//		}
//		
//		return str[0] + " " + str[str.length-1];
//	}

}
