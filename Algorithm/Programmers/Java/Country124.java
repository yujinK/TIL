package programmers;

public class Country124 {
	
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
	
	public static String solution(int n) {
		String[] num = {"4", "1", "2"};
		String answer = "";
		
		while (n > 0) {
			answer = num[n % 3] + answer;
			n = (n - 1) / 3;
		}
		
		return answer;
	}
	
//	public static String solution(int n) {
//		if (n == 1) {
//			return "1" + answer;
//		} else if (n == 2) {
//			return "2" + answer;
//		} else if (n == 3) {
//			return "4" + answer;
//		}
//		
//		switch(n % 3) {
//			case 1:
//				answer = "1" + answer;
//				break;
//			case 2:
//				answer = "2" + answer;
//				break;
//			case 0:
//				answer = "4" + answer;
//				return solution((n / 3) -1);
//		}
//		
//		return solution(n / 3);
//	}

}
