package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DropMath {

	public static void main(String[] args) {
		int[] answers = {1, 3, 2, 4, 2};
		System.out.println(Arrays.toString(solution(answers)));
	}
	
	public static int[] solution(int[] answers) {
		int[] p1 = {1, 2, 3, 4, 5};
		int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] count = new int[3];
		
		for (int i=0; i<answers.length; i++) {
			if (answers[i] == p1[i % p1.length]) {
				count[0]++;
			}
			if (answers[i] == p2[i % p2.length]) {
				count[1]++;
			} 
			if (answers[i] == p3[i % p3.length]) {
				count[2]++;
			}
		}
		
		int max = Math.max(count[0], Math.max(count[1], count[2]));
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0; i<count.length; i++) {
			if (max == count[i]) {
				al.add(i+1);
			}
		}
		
		int[] answer = new int[al.size()];
		
		for(int i=0; i<al.size(); i++) {
			answer[i] = al.get(i);
		}
		
		return answer;
	}

}
