package programmers;

import java.util.Arrays;

public class SeoulKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
		return "�輭���� " + Arrays.asList(seoul).indexOf("Kim") + "�� �ִ�";
	}
	
//	public static String solution(String[] seoul) {
//		for (int i=0; i<seoul.length; i++) {
//			if (seoul[i].equals("Kim")) {
//				return "�輭���� " + i + "�� �ִ�";
//			}
//		}
//		
//		return null;
//	}

}
