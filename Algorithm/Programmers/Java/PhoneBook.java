package programmers;

public class PhoneBook {

	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"1235", "123", "12", "567", "88"};
		System.out.println(solution(phone_book));
	}
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		for (int i=0; i<phone_book.length-1; i++) {
			for (int j=i+1; j<phone_book.length; j++) {
				if (phone_book[i].indexOf(phone_book[j]) == 0 || phone_book[j].indexOf(phone_book[i]) == 0) {
					answer = false;
					return answer;
				}
			}
		}
		
		return answer;
	}

}
