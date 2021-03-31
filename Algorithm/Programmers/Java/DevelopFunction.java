package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DevelopFunction {

	public static void main(String[] args) {
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5, 10, 7};
		
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
	}
	
//	public static int[] solution(int[] progresses, int[] speeds) {
//		ArrayList<Integer> countList = new ArrayList<Integer>();
//		Stack<Integer> stack = new Stack<Integer>();
//		int[] answer;
//		int max = -1;
//		
//		for (int i=0; i<progresses.length; i++) {
//			int day = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
//			if (stack.isEmpty()) {
//				stack.add(day);
//				max = day;
//			} else if (day <= max) {
//				stack.add(day);
//			} else {
//				countList.add(stack.size());
//				stack.clear();
//				stack.add(day);
//				max = day;
//			}
//		}
//		
//		if (!stack.isEmpty()) {
//			countList.add(stack.size());
//		}
//		
//		answer = new int[countList.size()];
//		
//		for (int i=0; i<countList.size(); i++) {
//			answer[i] = countList.get(i);
//		}
//		
//		return answer;
//	}

}
