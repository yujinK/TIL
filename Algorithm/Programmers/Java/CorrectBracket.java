package programmers;

public class CorrectBracket {

	public static void main(String[] args) {
		
	}
	
	public static boolean solution(String s) {
		int count = 0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            }
        }

        return count == 0 ? true : false;
	}

}
