package codility;

public class Lesson3_2 {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 5};
		System.out.println(permMissingElem(A));
	}

	public static int permMissingElem(int[] A) {
		int sum = 0;
		int N = A.length + 1;
		
		if (N%2 == 0) {
			sum = (1+N) * (N/2);
		} else {
			sum = (N * (N/2)) + N;
		}
		
		for (int i : A) {
			sum -= i;
		}
		
		return sum;
	}
}
