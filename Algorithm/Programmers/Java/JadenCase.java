package programmers;

public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] str = s.toLowerCase().split("");
		boolean flag = true;
		
		for (String ss : str) {
			answer += flag ? ss.toUpperCase() : ss;
			flag = ss.equals(" ") ? true : false;
		}
		
		return answer;
	}
	
//	public static String solution(String s) {
//		String answer = "";
//		boolean flag = false;
//		
//		for (int i=0; i<s.length(); i++) {
//			String sub = s.substring(i, i+1);
//			if (sub.equals(" ")) {
//				flag = false;
//				answer += " ";
//			} else {
//				if (!flag) {
//					//Ã¹ ±ÛÀÚ
//					flag = true;
//					answer += sub.toUpperCase();
//				} else {
//					answer += sub.toLowerCase();
//				}
//			}
//		}
//		
//		return answer;
//	}

}
