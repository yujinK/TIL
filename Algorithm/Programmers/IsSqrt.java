package programmers;

public class IsSqrt {

	public static void main(String[] args) {
		System.out.println(solution(50000000000000L));
	}
	
	public static long solution(long n) {
		long sqrt = (long) Math.sqrt(n);
		
		if (Math.pow(sqrt, 2) == n) {
			return (long)(Math.pow(sqrt+1, 2));
		} else {
			return -1;
		}
	}

}
