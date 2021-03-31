package programmers;

public class HidePhoneNumber {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
		
		for (int i=0; i<ch.length-4; i++) {
			ch[i] = '*';
		}
		
		return String.valueOf(ch);
	}
	
//	public static String solution(String phone_number) {
//		String answer = "";
//		
//		for (int i=0; i<phone_number.length()-4; i++) {
//			answer += "*";
//		}
//		
//		return answer += phone_number.substring(phone_number.length()-4); 
//	}

}
