package programmers;

public class NextBigNumber {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
		int answer = n + 1;
		int count = Integer.bitCount(n);
		
		while (Integer.bitCount(++answer) != count) {}
		
		return answer;
	}
	
	//2차 시도 - 1의 개수 count 메소드 추가
//	public static int oneCount(String binary) {
//		char[] c = binary.toCharArray();
//		int count = 0;
//		
//		for (int i=0; i<c.length; i++) {
//			if (c[i] - '0' == 1) {
//				count++;
//			}
//		}
//		
//		return count;
//	}
	
	//1차 시도 - 시간초과
//	public static String binaryConversion(int n) {
//		//이진수 변환
//		String binary = "";
//		
//		while (n != 1) {
//			binary = String.valueOf(n % 2) + binary;
//			n = n / 2;
//		}
//		
//		binary = String.valueOf(n) + binary;
//		return binary;
//	}
//	
//	public static int numberCheck(int n) {
//		//이진수 1의 개수 체크
//		char[] c = binaryConversion(n).toCharArray();
//		int count = 0;
//		
//		for (int i = 0; i<c.length; i++) {
//			if (c[i] - '0' == 1) {
//				count++;
//			}
//		}
//		
//		return count;
//	}
}
