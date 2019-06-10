package programmers;

public class CaesarCipher {

	public static void main(String[] args) {
		System.out.println(solution("a B z", 4));
	}
	
	public static String solution(String s, int n) {
		String answer = "";
		
		for (int i=0; i<s.length(); i++) {
			int c = s.charAt(i);
		
			if (c >= 65 && c <= 90) {
				//대문자
				c += n;
				
				while (!(c >= 65 && c <= 90)) {
					c -= 26;
				}
			} else if (c >= 97 && c <= 122) {
				//소문자
				c += n;
				
				while (!(c >= 97 && c <= 122)) {
					c -= 26;
				}
			}
			
			answer += (char) c;
		}
		
		return answer;
	}

}
