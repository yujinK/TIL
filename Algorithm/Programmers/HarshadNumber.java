package programmers;

public class HarshadNumber {

	public static void main(String[] args) {
		System.out.println(solution(13));
	}
	
	public static boolean solution(int x) {
		char[] c = String.valueOf(x).toCharArray();
		int num = 0;
		
		for (int i=0; i<c.length; i++) {
			num += c[i] - '0';
		}
		
		return x % num == 0;
	}

}