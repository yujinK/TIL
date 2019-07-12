package programmers;

public class Tournament {

	public static void main(String[] args) {
		System.out.println(solution(8, 4, 7));
	}
	
	public static int solution(int n, int a, int b) {
		int round = 0;
		
		while (a != b) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			round++;
		}
		
		return round;
	}

}
