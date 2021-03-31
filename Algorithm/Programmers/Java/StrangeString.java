package programmers;

public class StrangeString {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] words = s.split("");
		int cnt = -1;
		
		for (String ss : words) {
			cnt = ss.contains(" ") ? -1 : ++cnt;
			answer += cnt % 2 == 0 ? ss.toUpperCase() : ss.toLowerCase();
		}
		
		return answer;
	}
	
//	public static String solution(String s) {
//		String answer = "";
//		String[] words = s.split(" ", -1);
//		
//		for (int i=0; i<words.length; i++) {
//			String word = "";
//			for (int j=0; j<words[i].length(); j++) {
//				String alphabet = words[i].substring(j, j+1);
//				alphabet = j % 2 == 0 ? alphabet.toUpperCase() : alphabet.toLowerCase();
//				word += alphabet;
//			}
//			
//			words[i] = word;
//		}
//		
//		for (int i=0; i<words.length; i++) {
//			if (i > 0) {
//				answer += " ";
//			}
//			answer += words[i];
//		}
//		
//		return answer;
//	}

}
