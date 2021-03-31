package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfPS {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toLowerCase();
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
		int numP = 0, numY = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				numP++;
			} else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				numY++;
			}
		}
		
		return numP == numY;
	}

}
