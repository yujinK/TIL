package programmers;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		int answer = arr[0];
		
		for (int i=1; i<arr.length; i++) {
			answer = arr[i] * answer / gcd(arr[i], answer);
		}
		
		return answer;
	}
	
	
	//첫 번째 풀이
//	public static int solution(int[] arr) {
//		int n = 1;
//		
//		while(true) {
//			boolean flag = true;
//			
//			for (int i=0; i<arr.length; i++) {
//				if (n % arr[i] != 0) {
//					flag = false;
//					break;
//				}
//			}
//			
//			if (flag) {
//				break;
//			}
//			
//			n++;
//		}
//		
//		return n;
//	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		
		return a;
	}

}
