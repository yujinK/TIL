package programmers;

import java.util.Arrays;

public class SortDesc {

	public static void main(String[] args) {
		System.out.println(solution(7123456789L));
	}
	
	public static long solution(long n) {
		char[] c = String.valueOf(n).toCharArray();
		Arrays.sort(c);
		String answer = "";
		
		for (int i=c.length-1; i>=0; i--) {
			answer += c[i];
		}
		
		return Long.parseLong(answer);
	}

}
