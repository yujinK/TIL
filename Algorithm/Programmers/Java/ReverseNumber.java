package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1230)));
	}
	
	public static int[] solution(long n) {
		String s = "" + n;
		int[] answer = new int[s.length()];
		
		for (int i=0; i<answer.length; i++) {
			answer[i] = (int)(n % 10);
			n /= 10;
		}
		
		return answer;
	}
	
//	public static int[] solution(long n) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		while (n > 0) {
//			list.add(Math.toIntExact(n % 10));
//			n /= 10;
//		}
//		
//		int[] answer = new int[list.size()];
//		
//		for (int i=0; i<answer.length; i++) {
//			answer[i] = list.get(i);
//		}
//		
//		return answer;
//	}

}
