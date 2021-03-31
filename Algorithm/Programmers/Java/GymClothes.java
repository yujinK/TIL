package programmers;

import java.util.Arrays;

public class GymClothes {

	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] students = new int[n];
		Arrays.fill(students, 1);
		
		for (int i=0; i<reserve.length; i++) {
			students[reserve[i]-1]++;
		}
		
		for (int i=0; i<lost.length; i++) {
			students[lost[i]-1]--;
		}
		
		for (int i=0; i<students.length; i++) {
			if (students[i] >= 1) {
				answer++;
			} else if (i > 0 && students[i-1] > 1) {
				students[i-1]--;
				students[i]++;
				answer++;
			} else if (i < students.length-1 && students[i+1] > 1) {
				students[i+1]--;
				students[i]++;
				answer++;
			}
		}
		
		return answer;
	}

}
