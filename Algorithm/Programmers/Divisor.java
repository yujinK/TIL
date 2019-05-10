package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisor {

	public static void main(String[] args) {
//		int[] arr = {5, 9, 7, 10};
		int[] arr = {10, 7, 9, 5};
		int divisor = 5;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}
	
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
		Arrays.sort(answer);
		return answer;
	}
	
//	public static int[] solution(int[] arr, int divisor) {
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		for (int i : arr) {
//			if (i % divisor == 0) {
//				al.add(i);
//			}
//		}
//		
//		int[] answer;
//		
//		if (al.size() != 0) {
//			answer = new int[al.size()];
//			
//			for (int i=0; i<answer.length; i++) {
//				answer[i] = al.get(i);
//			}
//		} else {
//			answer = new int[] {-1};
//		}
//		
//		Arrays.sort(answer);
//		
//		return answer;
//	}

}
