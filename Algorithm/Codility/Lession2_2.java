package codility;

import java.util.Arrays;

public class Lession2_2 {

	public static void main(String[] args) {
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(unpair(A));
	}

	public static int unpair(int[] A) {
		int result = 0;
		
		for (int i : A) {
			result ^= i;
		}
		
		return result;
	}
	
//	public static int unpair(int[] A) {
//		int result = 0;
//		
//		Arrays.sort(A);
//		
//		for (int i=0; i<A.length-2; i++) {
//			if (A[i] != A[i+1] && A[i+1] != A[i+2]) {
//				result = A[i+1];
//			}
//		}
//		
//		return result;
//	}
}
