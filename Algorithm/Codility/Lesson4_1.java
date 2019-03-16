package codility;

public class Lesson4_1 {

	public static void main(String[] args) {
		int[] A = {1, 4, 1};
		System.out.println(permCheck(A));
	}
	
	public static int permCheck(int[] A) {
		int result = 0;
		int[] check = new int[A.length];
		
		for (int i=0; i<check.length; i++) {
			check[i] = i+1;
		}
		
		for (int i=0; i<A.length; i++) {
			result ^= A[i] ^ check[i];
		}
		
		if (result == 0) {
			return 1;
		} else {
			return 0;
		}
	}

//	public static int permCheck(int[] A) {
//		int sum = 0;
//		int N = A.length;
//		
//		if (N%2 == 0) {
//			sum = (1+N) * (N/2);
//		} else {
//			sum = (N * (N/2)) + N;
//		}
//		
//		for (int j=0; j<A.length; j++) {
//			sum -= A[j];
//		}
//		
//		if (sum == 0) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
}
