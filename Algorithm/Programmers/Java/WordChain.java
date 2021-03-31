package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class WordChain {

	public static void main(String[] args) {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(Arrays.toString(solution(n, words)));
	}
	
	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		HashSet<String> wordSet = new HashSet<String>();
		wordSet.add(words[0]);
		
		for (int i=1; i<words.length; i++) {
			if (words[i].length() == 1 || wordSet.contains(words[i]) || !words[i].startsWith(words[i-1].substring(words[i-1].length()-1))) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			} else {
				wordSet.add(words[i]);
			}
		}
		
		return answer;
	}

}
