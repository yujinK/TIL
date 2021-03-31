package programmers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1}; 
		int location = 0;
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] arrOrder = new int[priorities.length];
		int order = 1;
		
		for (int i=0; i<priorities.length; i++) {
			queue.offer(i);
		}
		
		while (!queue.isEmpty()) {
			boolean flag = true;
			int index = queue.poll();
			Iterator<Integer> it = queue.iterator();
			
			while (it.hasNext()) {
				if (priorities[index] < priorities[it.next()]) {
					queue.offer(index);
					flag = false;
					break;
				}
			}
			
			if (flag) {
				arrOrder[index] = order;
				order++;
			}
		}
		
		return arrOrder[location];
	}

}
