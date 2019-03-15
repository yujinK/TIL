package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson1 {

	public static void main(String[] args) {
		System.out.println(binaryGap(1041));
	}
	
	public static int binaryGap(int N) {
		String binary = "";
		List<Integer> gabList = new ArrayList<>();
		boolean flag = false;
		int count = 0;
		int result = 0;
		
		while(N!=0) {
			binary += String.valueOf(N % 2);
			N = N/2;
		}
		
		binary = (new StringBuffer(binary)).reverse().toString();
		
		for (int i=0; i<binary.length()-1; i++) {
			if (flag == false && binary.substring(i, i+1).equals("1") && binary.substring(i+1, i+2).equals("0")) {
				flag = true;
//				count++;
			}
			if (flag == true && binary.substring(i+1, i+2).equals("0")) {
				count++;
			}
			if (flag == true && binary.substring(i, i+1).equals("0") && binary.substring(i+1, i+2).equals("1")) {
				flag = false;
				gabList.add(count);
				count = 0;
			}
		}
		
		if (!gabList.isEmpty()) {
			Collections.sort(gabList);
			result = gabList.get(gabList.size()-1);
		}
		
		
		return result;
	}
}
