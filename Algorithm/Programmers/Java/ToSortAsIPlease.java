package programmers;

import java.util.Arrays;

public class ToSortAsIPlease {

	public static void main(String[] args) {
		String[] strings = new String[] {"abce", "abcd", "cdx"};
		System.out.println(Arrays.toString(solution(strings, 1)));
	}
	
	public static String[] solution(String[] strings, int n) {
		for (int i=0; i<strings.length-1; i++) {
			for (int j=i+1; j<strings.length; j++) {
				char first = strings[i].charAt(n);
				char second = strings[j].charAt(n);
				if (first > second || (first == second && strings[i].compareTo(strings[j]) > 0)) {
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}
		
		return strings;
	}

}
