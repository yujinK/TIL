package codility;

public class Lesson3_3 {

	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(tapeEquilibrium(A));
	}
	
	public static int tapeEquilibrium(int[] A) {
		int left = 0, right = 0, min = Integer.MAX_VALUE;
		
		for (int i : A) {
			right += i;
		}
		
		for (int j=0; j<A.length-1; j++) {
			left += A[j];
			right -= A[j];
			
			min = Math.min(min, Math.abs(left-right));
		}
			
		return min;
	}
}
