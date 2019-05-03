package programmers;

public class HandleString {

	public static void main(String[] args) {
		
	}
	
	public static boolean solution(String s) {
		String pattern = "^[0-9]*$";
		
		if ((s.length() == 4 || s.length() == 6) && s.matches(pattern)) {
			return true;
		}
		
		return false;
	}

}
