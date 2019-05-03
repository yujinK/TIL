package programmers;

public class JumpAndTeleport {

	public static void main(String[] args) {
		System.out.println(solution(5000));
	}
	
	public static int solution(int n) {
		int answer = 0;
		
		while (n > 0) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n - 1;
				answer++;
			}
		}
		
		return answer;
	}

}
