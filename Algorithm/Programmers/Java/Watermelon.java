package programmers;

public class Watermelon {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
	public static String solution(int n) {
		String answer = "";
		
		for (int i=1; i<=n; i++) {
			answer += i % 2 != 0 ? "¼ö" : "¹Ú"; 
		}
		
		 return answer;
	}

}
