package programmers;

import java.util.HashMap;

public class Camouflage {

	public static void main(String[] args) {
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		System.out.println(solution(clothes));
	}
	
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i=0; i<clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		for (String s : map.keySet()) {
			answer *= map.get(s) + 1;
		}
		
		return answer - 1;
	}

}
