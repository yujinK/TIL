package programmers;

public class NumberOfFactor {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}
	
	public static int solution(int n) {
		int sum = 0;
		
		for (int i=1; i<=Math.abs(n); i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
