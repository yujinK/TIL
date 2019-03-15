package codility;

import java.util.Arrays;

public class Lesson2_1 {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		int K = 4;
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(rotation(A, K)));
	}

	public static int[] rotation(int[] A, int K) {
		int[] result = new int[A.length];
		
		for (int i=0; i<A.length; i++) {
			result[(i+K)%A.length] = A[i];
		}
		
		return result;
	}
}
