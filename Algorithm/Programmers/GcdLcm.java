package programmers;

public class GcdLcm {

	public static void main(String[] args) {
		System.out.println(getGCD(3, 12));
	}
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = getGCD(n, m);
		answer[1] = getLCM(n, m);
		return answer;
	}
	
	public static int getGCD(int n, int m) {
		int r;
		
		if (n < m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		while (true) {
			r = n % m;
			
			if (r == 0) return m;
			else {
				n = m;
				m = r;	
			}
		}
	}

	public static int getLCM(int n, int m) {
		return n * m / getGCD(n, m);
	}
}
