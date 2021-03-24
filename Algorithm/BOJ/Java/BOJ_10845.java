package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10845 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		ArrayList<Integer> queue = new ArrayList<Integer>();
		
		while (i <= n) {
			String[] function = scan.nextLine().split(" ");
			
			switch(function[0]) {
				case "push":
					queue.add(Integer.parseInt(function[1]));
					break;
				case "pop":
					if (queue.size() > 0) {
						System.out.println(queue.get(0));
						queue.remove(0);
					} else {
						System.out.println(-1);
					}
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					if (queue.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "front":
					if (queue.size() > 0) {
						System.out.println(queue.get(0));
					} else {
						System.out.println(-1);
					}
					break;
				case "back":
					if (queue.size() > 0) {
						System.out.println(queue.get(queue.size()-1));
					} else {
						System.out.println(-1);
					}
					break;
			}
			
			i++;
		}
	}

}
