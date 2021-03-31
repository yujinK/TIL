package programmers;

public class CenterChar {

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
	}
	
	public static String solution(String s) {		
//		return s.length() % 2 == 0 ? String.valueOf(s.charAt(s.length() / 2 - 1)) + String.valueOf(s.charAt(s.length() / 2)) : String.valueOf(s.charAt(s.length() / 2));
		return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
	}

}
