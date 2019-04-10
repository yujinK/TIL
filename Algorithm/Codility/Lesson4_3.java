package codility;

import java.util.Arrays;

public class Lesson4_3 {

	public static void main(String[] args) {
		int N = 5;
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		System.out.println(Arrays.toString(solution(N, A)));
	}
	
	public static int[] solution(int N, int[] A) {
		int[] counter = new int[N];
	    int tmpMaxCounter = 0;
	    int doneMaxCounter = 0;
	 
	    for (int i = 0; i < A.length; i++) {
	        if (A[i] > N) {
	            doneMaxCounter = tmpMaxCounter;
	        }
	        else {
	            if (counter[A[i] - 1] < doneMaxCounter) {
	                counter[A[i] - 1] = doneMaxCounter;
	            }
	 
	            counter[A[i] - 1]++;
	 
	            if (counter[A[i] - 1] > tmpMaxCounter) {
	                tmpMaxCounter = counter[A[i] - 1];
	            }
	        }
	    }
	 
	    if (doneMaxCounter > 0) {
	        for (int i = 0; i < counter.length; i++) {
	            if (counter[i] < doneMaxCounter) {
	                counter[i] = doneMaxCounter;
	            }
	        }
	    }
	 
	    return counter;
	}
	
//	public static int[] solution(int N, int[] A) {
//		//정확성 100%
//		//퍼포먼스 60%
//		//전체 77%
//		int[] counters = new int[N];
//		int max = 0;
//		
//		for (int i=0; i<A.length; i++) {
//			if (A[i] == N+1) {
//				Arrays.fill(counters, max);
//			} else {
//				counters[A[i]-1]++;
//				if (counters[A[i]-1] > max) {
//					max = counters[A[i]-1];
//				}
//			}
//		}
//		
//		return counters;
//	}

//	public static int[] solution(int N, int[] A) {
	//정확성 100%
	//퍼포먼스 60%
	//전체 77%
//		int[] counters = new int[N];
//		int max = 0;
//		
//		for (int i=0; i<A.length; i++) {
//			if (A[i] == N+1) {
//				for (int j=0; j<counters.length; j++) {
//					counters[j] = max;
//				}
//			} else {
//				counters[A[i]-1]++;
//				if (counters[A[i]-1] > max) {
//					max = counters[A[i]-1];
//				}
//			}
//		}
//		
//		return counters;
//	}
}
