package boj;

public class BOJ_4673 {
	static boolean[] isSelfNum = new boolean[10000];
	
	public static void main(String[] args) {
		for (int i=0; i<10000; i++) {
			selfNumber(i+1);
		}
		
		for (int i=0; i<10000; i++) {
			if (!isSelfNum[i]) {
				System.out.println(i+1);
			}
		}
	}
	
	public static int selfNumber(int n) {
		if (n < 10000) {
			int num = n;
			int sum = num;
			
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if (sum <= 10000 && !isSelfNum[sum-1]) {
				isSelfNum[sum-1] = true;
			}
			
			return selfNumber(sum);
		}
		
		return 0;
	}
	
}
