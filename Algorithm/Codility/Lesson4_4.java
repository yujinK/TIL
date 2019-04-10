package codility;

import java.util.HashSet;
import java.util.Set;

public class Lesson4_4 {

	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
//		int[] A = {1, 2, 3};
//		int[] A = {-1, -3};
//		int[] A = {-1};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Set<Integer> foundNums = new HashSet<>();
		 
	    for (int i : A) {
	    	foundNums.add(i);
	    }
	    
	    for (int i=1; i<=Integer.MAX_VALUE; i++) {
	    	if (!foundNums.contains(i)) {
	    		return i;
	    	}
	    }
	    
	    return -1;
	}
	
	//정렬해서 찾는 방법을 사용했으나 스코어 처참.....Set이 있다는 것을 알았다...
}
