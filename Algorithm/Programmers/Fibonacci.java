package programmers;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(solution(100000));
	}
	
	public static int solution(int n) {
		int[] fibo = new int[n+1];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for (int i=2; i<=n; i++) {
			fibo[i] = (fibo[i-2] % 1234567) + (fibo[i-1] % 1234567);
		}
		
		return fibo[n] % 1234567;
	}

}
