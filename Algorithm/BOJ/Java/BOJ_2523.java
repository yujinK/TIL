package boj;

import java.util.Scanner;

public class BOJ_2523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = "";

        for (int i=0; i<2*n-1; i++) {
            if (i < n) {
                str += "*";
            } else {
                str = str.substring(0, str.length()-1);
            }
            System.out.println(str);
        }
    }
}
