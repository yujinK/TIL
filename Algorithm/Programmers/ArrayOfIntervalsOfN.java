package programmers;

import java.util.Arrays;

public class ArrayOfIntervalsOfN {

	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		System.out.println(Arrays.toString(solution(x, n)));
	}
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		
		for (int i=1; i<n; i++) {
			answer[i] = answer[i-1] + x;
		}
		
		return answer;
	}

}
