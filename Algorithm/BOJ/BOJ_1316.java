package boj;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		int n = scan.nextInt();
		int count = 0;
		boolean flag = true;
		scan.nextLine();
				
		for (int i=0; i<n; i++) {
			String s = scan.nextLine();
			hs.add(s.substring(0, 1));
			
			for (int j=1; j<s.length(); j++) {
				String now = s.substring(j, j+1);
				String prev = s.substring(j-1, j);
				if (!now.equals(prev)) {
					if (hs.contains(now)) {
						flag = false;
						break;
					} else {
						hs.add(now);
					}
				}
			}
			
			if (flag) {
				count++;
			}
			
			flag = true;
			hs.clear();
		}
		
		System.out.println(count);
		scan.close();
	}

}
