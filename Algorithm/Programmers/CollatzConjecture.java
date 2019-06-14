package programmers;

public class CollatzConjecture {

	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
	
	public static int solution(int num) {
		int count = 0;
		long input = num;
		
		while (input != 1) {
			if (count >= 500) {
				return -1;
			}
			if (input % 2 == 0) {
				input /= 2;
			} else {
				input *= 3;
				input++;
			}
			
			count++;
		}
		
		return count;
	}

}
