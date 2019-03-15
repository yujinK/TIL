package codility;

public class Lesson3_1 {

	public static void main(String[] args) {
		System.out.println(frogJump(5, 105, 3));
	}
	
	public static int frogJump(int X, int Y, int D) {
		int result = 0;
		
		if ((Y-X)%D == 0) {
			result = (Y-X)/D;
		} else {
			result = ((Y-X)/D) + 1;
		}
		
		return result;
	}
	
//	public static int frogJump(int X, int Y, int D) {
//		int result = 0;
//		
//		while (X < Y) {
//			X += D;
//			result++;
//		}
//		
//		return result;
//	}
}
