package programmers;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		
		System.out.println(solution(d, budget));
	}
	
	public static int solution(int[] d, int budget) {
		int answer = 0;
		
		Arrays.sort(d);
		
		for (int i : d) {
			if (budget >= i) {
				answer++;
				budget -= i;
			} else {
				break;
			}
		}
		
		return answer;
	}

}
