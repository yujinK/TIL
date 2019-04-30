package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class SkillTree {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_tress = {"BACDE", "CBADF", "AECB", "BDA", "AEFG"};
		
		System.out.println(solution(skill, skill_tress));
	}
	
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
	}
	
//	public static int solution(String skill, String[] skill_trees) {
//		int answer = 0;
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		
//		for (int i=0; i<skill.length(); i++) {
//			hm.put(skill.substring(i, i+1), i);
//		}
//		
//		for (int i=0; i<skill_trees.length; i++) {
//			int prev = -1;
//			boolean flag = true;
//			for (int j=0; j<skill_trees[i].length(); j++) {
//				String s = skill_trees[i].substring(j, j+1);
//				
//				if (hm.containsKey(s)) {
//					if (prev + 1 == hm.get(s)) {
//						prev++;
//					} else {
//						flag = false;
//						break;
//					}
//				}
//			}
//			
//			if (flag) {
//				answer++;
//			}
//		}
//		
//		return answer;
//	}

}
