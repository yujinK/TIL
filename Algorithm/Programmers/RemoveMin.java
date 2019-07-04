package programmers;

import java.util.Arrays;

public class RemoveMin {

	public static void main(String[] args) {
		int[] arr = {10};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		int min = 0;
		int index = 0;
		
		if (answer.length == 0) {
			return new int[] {-1};
		}
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < arr[min]) {
				min = i;
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			if (i != min) {
				answer[index] = arr[i];
				index++;
			}
		}
		
		return answer;
	}

}
