package boj;

import java.util.Scanner;

public class BOJ_5543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int burger1 = scan.nextInt();
        int burger2 = scan.nextInt();
        int burger3 = scan.nextInt();
        int coke = scan.nextInt();
        int cider = scan.nextInt();

        System.out.println(Math.min(burger1, Math.min(burger2, burger3)) + Math.min(coke, cider) - 50);
    }
}
