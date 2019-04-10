package codility;

import java.util.HashMap;
import java.util.Map;

public class Lesson4_2 {

	public static void main(String[] args) {
		int X = 5;
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		
		System.out.println(solution(X, A));
	}
	
	public static int solution(int X, int[] A) {
		int answer = -1;
		Map<Integer, Integer> check = new HashMap<>();
		
		for (int i=1; i<=X; i++) {
			check.put(i, i);
		}
		
		for (int i=0; i<A.length; i++) {
			if (check.containsKey(A[i])) {
				check.remove(A[i]);
			}
			
			if (check.isEmpty()) {
				answer = i;
				return answer;
			}
		}
		
		return answer;
	}

//	public static int solution(int X, int[] A) {
//		int answer = -1;
//		boolean[] check = new boolean[X];
//		
//		for(int i=0; i<A.length; i++) {
//			check[A[i]-1] = true;
//			
//			for (int j=0; j<check.length; j++) {
//				if (!check[j]) {
//					break;
//				}
//				
//				if (check[j] && j == check.length-1) {
//					answer = i;
//					return answer;
//				}				
//			}
//		}
//		
//		return answer;
//	}
}
