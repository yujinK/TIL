package programmers;

import java.util.Arrays;

public class Carpet {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 2)));
	}
	
	public static int[] solution(int brown, int red) {
		int[] answer = new int[2];
		
		for (int i=red; i>=0; i--) {
			if (red % i == 0) {
				int horizontal = i + 2;
				int vertical = red / i;
				if ((horizontal + vertical) * 2 == brown) {
					answer = new int[] {horizontal, vertical+2};
					break;
				}
			}
		}
		
		return answer;
	}

}
