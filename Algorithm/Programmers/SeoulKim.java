package programmers;

import java.util.Arrays;

public class SeoulKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
		return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
	
//	public static String solution(String[] seoul) {
//		for (int i=0; i<seoul.length; i++) {
//			if (seoul[i].equals("Kim")) {
//				return "김서방은 " + i + "에 있다";
//			}
//		}
//		
//		return null;
//	}

}
