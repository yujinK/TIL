package programmers;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		int[][] arr1 = {{1, 2}, {3, 4}};
		int[][] arr2 = {{5, 6, 7}, {8, 9, 10}};
		solution(arr1, arr2);
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for (int i=0; i<answer.length; i++) {
			for (int j=0; j<answer[0].length; j++) {
				for (int k=0; k<arr1[0].length; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		return answer;
	}

}
