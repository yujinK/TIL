package programmers;

public class Tiling {

	public static void main(String[] args) {
		
	}
	
	public int solution(int n) {
		int[] count = new int[n+1];
		count[1] = 1;
		count[2] = 2;
		
		for (int i=3; i<count.length; i++) {
			count[i] = count[i-2] + count[i-1];
		}
		
		return count[n];
	}

}
