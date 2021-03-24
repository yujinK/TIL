package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//		String s = br.readLine();
//		
//		for (int i=0; i<alphabet.length; i++) {
//			System.out.print(s.indexOf(alphabet[i]) + " ");
//		}
		
		String s = br.readLine();
		for (int i=97; i<=122; i++) {
			System.out.print(s.indexOf(i) + " ");
		}
	}
}
