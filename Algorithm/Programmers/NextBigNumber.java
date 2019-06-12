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
	
	//2�� �õ� - 1�� ���� count �޼ҵ� �߰�
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
	
	//1�� �õ� - �ð��ʰ�
//	public static String binaryConversion(int n) {
//		//������ ��ȯ
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
//		//������ 1�� ���� üũ
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
