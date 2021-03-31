package programmers;

import java.util.stream.IntStream;

public class Average {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(solution(arr));
	}
	
	public static double solution(int[] arr) {
		double sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
	}
	
//	public static double solution(int[] arr) {
//		return IntStream.of(arr).mapToDouble(n -> (double) n).average().getAsDouble();
//	}

}
