package programmers;

public class LongJump {

	public static void main(String[] args) {
		System.out.println(solution(1234567));
	}
	
	public static long solution(int n) {
		long[] ways = new long[n+1];
		
		for (int i=1; i<=n; i++) {
			if (i <= 3) {
				ways[i] = i;
			} else {
				ways[i] = (ways[i-2] % 1234567) + (ways[i-1] % 1234567);
			}
		}
		
		return (long) (ways[n] % 1234567);
	}

}
