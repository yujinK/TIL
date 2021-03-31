package programmers;

public class ExpressionOfNumber {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static int solution(int n) {
		int count = 0;
		int criteria = 1;
		int number = 1;
		int result = 0;
		
		while (criteria <= n) {
			result += number++;
			
			if (result == n) {
				count++;
			} else if (result > n) {
				number = ++criteria;
				result = 0;
			}
		}
		
		return count;
	}

}
