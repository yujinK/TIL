package programmers;

import java.util.Arrays;

public class Origami {
//    public static int[] solution(int n) {
//        String origami = "0";
//        for (int i=2; i<=n; i++) {
//            StringBuilder sb = new StringBuilder(origami);
//            sb.append("0");
//            String[] splitS = origami.split("");
//            for (int j=origami.length()-1; j>=0; j--) {
//                String appendS = splitS[j].equals("0") ? "1" : "0";
//                sb.append(appendS);
//            }
//
//            origami = sb.toString();
//        }
//
//        int[] result = new int[origami.length()];
//        String[] sS = origami.split("");
//        for (int i=0; i<sS.length; i++) {
//            result[i] = Integer.parseInt(sS[i]);
//        }
//
//        return result;
//    }

    public static int[] solution(int n) {
        if (n == 1) return new int[] {0};
        int[] temp = solution(n - 1);
        int[] answer = new int[temp.length * 2 + 1];

        for (int i=0; i<answer.length; i++) {
            if (i < temp.length) answer[i] = temp[i];
            else if (i == temp.length) answer[i] = 0;
            else answer[i] = temp[answer.length - i - 1] == 0 ? 1 : 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4)));
    }
}
