package boj;

import java.util.Scanner;

public class BOJ_2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int v = scan.nextInt();
        int answer = 1, subValue = a - b;
        v -= a;
        int share = v / subValue;

        if (v - (subValue * share) <= 0) {
            answer += share;
        } else {
            answer += share + 1;
        }

        System.out.println(answer);
    }
}
