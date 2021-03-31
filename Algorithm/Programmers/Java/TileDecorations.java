package programmers;

public class TileDecorations {

	public static void main(String[] args) {
		System.out.println(solution(80));
	}
	
	public static long solution(int N) {
		long[] tile = new long[N];
		
		for (int i=0; i<N; i++) {
			if (i == 0 || i == 1) {
				tile[i] = 1;
			} else {
				tile[i] = tile[i-1] + tile[i-2];
			}
		}
		
		return (2 * tile[N-1] + tile[N-2]) * 2;
	}
	
//	public static long solution(int N) {
//		long round = 0;
//		long[] tile = new long[N];
//		
//		for (int i=0; i<N; i++) {
//			if (i == 0 || i == 1) {
//				tile[i] = 1;
//			} else {
//				tile[i] = tile[i-1] + tile[i-2];
//			}
//		}
//		
//		for (int i=0; i<N; i++) {
//			if (i == 0) {
//				round = 4;
//			} else {
//				round += tile[i] * 2;
//			}
//		}
//		
//		return round;
//	}

}
